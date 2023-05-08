package com.api.repositories;

import com.api.model.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntradaRepository extends JpaRepository<Entrada, String> {
    List<Entrada> findAllByFechaMod(String fechaMod);
}
