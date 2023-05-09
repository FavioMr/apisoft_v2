package com.api.repositories;

import com.api.model.Almacen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlmacenRepository extends JpaRepository<Almacen,Integer> {

    Almacen findByid(Integer id);
}
