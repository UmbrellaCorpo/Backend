package org.example.umbrellaacademy;

import org.example.umbrellaacademy.Data.EvolutionData;
import org.example.umbrellaacademy.Services.EvolutionDataService;
import org.example.umbrellaacademy.Data.HominidoData;
import org.example.umbrellaacademy.Services.HominidosDataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api/data")
public class DataController {

    private final EvolutionDataService evolutionDataService;
    private final HominidosDataService homininosDataService;

    // Constructor para inyectar las dependencias manualmente
    public DataController(EvolutionDataService evolutionDataService, HominidosDataService homininosDataService) {
        this.evolutionDataService = evolutionDataService;
        this.homininosDataService = homininosDataService;
    }

    @PostMapping("/evolution")
    public ResponseEntity<String> processEvolutionData(@RequestBody List<EvolutionData> data) throws ExecutionException, InterruptedException {
        evolutionDataService.processEvolutionData(data).get();
        return ResponseEntity.ok("Evolution data processed successfully");
    }

    @PostMapping("/homininos")
    public ResponseEntity<String> processHomininosData(@RequestBody List<HominidoData> data) throws ExecutionException, InterruptedException {
        homininosDataService.processHominidoData(data).get();
        return ResponseEntity.ok("Homininos data processed successfully");
    }
}
