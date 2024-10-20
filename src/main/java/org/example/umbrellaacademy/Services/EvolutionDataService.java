package org.example.umbrellaacademy.Services;

import org.example.umbrellaacademy.Repos.EvolutionDataRepository;
import org.example.umbrellaacademy.Data.EvolutionData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class EvolutionDataService {

    private final EvolutionDataRepository evolutionDataRepository;

    private static final Logger logger = LoggerFactory.getLogger(EvolutionDataService.class);

    // Constructor manual
    public EvolutionDataService(EvolutionDataRepository evolutionDataRepository) {
        this.evolutionDataRepository = evolutionDataRepository;
    }

    @Async("threadPoolTaskExecutor")
    public CompletableFuture<Void> processEvolutionData(List<EvolutionData> dataList) {
        logger.info("Processing Evolution data asynchronously");

        dataList.parallelStream().forEach(data -> {
            logger.info("Saving species: {}", data.getSpecies());
            evolutionDataRepository.save(data);
        });

        return CompletableFuture.completedFuture(null);
    }
}
