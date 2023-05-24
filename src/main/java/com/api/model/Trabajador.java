package com.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "trabajador")
public class Trabajador {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nombre;
    private String apellidopa;
    private String apellidoma;
    private Integer idcargo;
    private String ntelefono;
    private String dni;
    private Integer idcarrera;

    public Trabajador() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidopa() {
        return apellidopa;
    }

    public void setApellidopa(String apellidopa) {
        this.apellidopa = apellidopa;
    }

    public String getApellidoma() {
        return apellidoma;
    }

    public void setApellidoma(String apellidoma) {
        this.apellidoma = apellidoma;
    }

    public Integer getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(Integer idcargo) {
        this.idcargo = idcargo;
    }

    public String getNtelefono() {
        return ntelefono;
    }

    public void setNtelefono(String ntelefono) {
        this.ntelefono = ntelefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(Integer idcarrera) {
        this.idcarrera = idcarrera;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "id='" + id + '\'' + ", nombre='" + nombre + '\'' + ", apellidopa='" + apellidopa + '\'' + ", apellidoma='" + apellidoma + '\'' + ", idcargo=" + idcargo + ", ntelefono=" + ntelefono + ", dni=" + dni + ", idcarrera=" + idcarrera + '}';
    }
}
