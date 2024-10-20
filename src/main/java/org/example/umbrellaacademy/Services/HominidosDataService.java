package org.example.umbrellaacademy.Services;

import org.example.umbrellaacademy.Repos.HominidosDataRepository;
import org.example.umbrellaacademy.Data.HominidoData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class HominidosDataService {

    private final HominidosDataRepository hominidosDataRepository;

    private static final Logger logger = LoggerFactory.getLogger(HominidosDataService.class);

    // Constructor manual para inicializar el repositorio
    public HominidosDataService(HominidosDataRepository hominidosDataRepository) {
        this.hominidosDataRepository = hominidosDataRepository;
    }

    @Async("threadPoolTaskExecutor")
    public CompletableFuture<Void> processHominidoData(List<HominidoData> dataList) {
        logger.info("Processing Hominido data asynchronously");

        dataList.parallelStream().forEach(data -> {
            logger.info("Saving hominido species: {}", data.getSpecies());
            hominidosDataRepository.save(data);
        });

        return CompletableFuture.completedFuture(null);
    }
}


