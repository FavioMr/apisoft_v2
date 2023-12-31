package com.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    //Declaramos el reso de los campos
    private String codigo;
    private String nombre;
    private Integer cantidadmin;
    private Integer cantidadact;
    private Integer almacen;
    private Double preciounitario;
    private String fechaingreso;

    public Producto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadmin() {
        return cantidadmin;
    }

    public void setCantidadmin(Integer cantidadmin) {
        this.cantidadmin = cantidadmin;
    }

    public Integer getCantidadact() {
        return cantidadact;
    }

    public void setCantidadact(Integer cantidadact) {
        this.cantidadact = cantidadact;
    }

    public Integer getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Integer almacen) {
        this.almacen = almacen;
    }

    public Double getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(Double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public String getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cantidadmin=" + cantidadmin +
                ", cantidadact=" + cantidadact +
                ", almacen=" + almacen +
                ", preciounitario=" + preciounitario +
                ", fechaingreso='" + fechaingreso + '\'' +
                '}';
    }
}
