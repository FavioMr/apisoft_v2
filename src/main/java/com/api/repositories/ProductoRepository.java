package com.api.repositories;

import com.api.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,String> {

    Producto findBycodigo(String codigo);
}
