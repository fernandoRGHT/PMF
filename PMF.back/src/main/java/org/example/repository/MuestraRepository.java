package org.example.repository;

import org.example.model.Muestra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MuestraRepository extends JpaRepository<Muestra, Long> {
    @Override
    List<Muestra> findAll();

    List<Muestra> findByCodAnalisis(String codAnalisis);
}
