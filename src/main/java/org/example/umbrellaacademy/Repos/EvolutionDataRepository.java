package org.example.umbrellaacademy.Repos;

import org.example.umbrellaacademy.Data.EvolutionData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvolutionDataRepository extends JpaRepository<EvolutionData, Long> {
    // Métodos de consulta personalizados pueden ir aquí
}
