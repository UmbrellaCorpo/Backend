package org.example.umbrellaacademy;

import org.example.umbrellaacademy.Data.EvolutionData;
import org.example.umbrellaacademy.Services.EvolutionDataService;
import org.example.umbrellaacademy.Data.HominidoData;
import org.example.umbrellaacademy.Services.HominidosDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api/data")
@RequiredArgsConstructor
public class DataController {

    private final EvolutionDataService evolutionDataService;
    private final HominidosDataService homininosDataService;

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

