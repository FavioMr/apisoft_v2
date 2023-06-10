package com.api.model;

import jakarta.persistence.*;

@Entity
@Table(name="salida")
public class Salida {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String cod_salida;
    private String trabajador_id;
    private String id_producto;
    private int cantidad_extraida;
    private String fecha_salida;
    private String hora_salida;

    public String getCod_salida() {
        return cod_salida;
    }

    public void setCod_salida(String cod_salida) {
        this.cod_salida = cod_salida;
    }

    public String getTrabajador_id() {
        return trabajador_id;
    }

    public void setTrabajador_id(String trabajador_id) {
        this.trabajador_id = trabajador_id;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad_extraida() {
        return cantidad_extraida;
    }

    public void setCantidad_extraida(int cantidad_extraida) {
        this.cantidad_extraida = cantidad_extraida;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }
}
