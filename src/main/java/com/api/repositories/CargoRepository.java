package com.api.repositories;

import com.api.model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends JpaRepository<Cargo,Integer> {
    Cargo findByid(Integer id);
}
