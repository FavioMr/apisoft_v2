package com.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "almacen")
public class Almacen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombreAlmacen;

    public Almacen() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreAlmacen() {
        return nombreAlmacen;
    }

    public void setNombreAlmacen(String nombreAlmacen) {
        this.nombreAlmacen = nombreAlmacen;
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "id=" + id +
                ", nombreAlmacen='" + nombreAlmacen + '\'' +
                '}';
    }
}
