package org.example.umbrellaacademy;

import org.example.umbrellaacademy.Data.EvolutionData;
import org.example.umbrellaacademy.Services.EvolutionDataService;
import org.example.umbrellaacademy.Data.HominidoData;
import org.example.umbrellaacademy.Services.HominidosDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

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
    // DataController.java

    @GetMapping("/api/process-data")
    public List<String> processData(@RequestParam List<String> data) {
        List<String> results = new ArrayList<>();

        // Ejecuta el procesamiento en varios hilos
        List<Future<String>> futures = dataProcessingService.processData(data);

        // Obtener los resultados de las tareas
        for (Future<String> future : futures) {
            try {
                results.add(future.get()); // Espera que cada hilo termine y obtiene el resultado
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        return results; // Retorna la lista de resultados
    }

}

