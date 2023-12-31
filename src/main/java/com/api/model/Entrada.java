package com.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "entradas")
public class Entrada {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String accion;
    private String usuarioActual;
    private String hora;
    private String fechaMod;

    private String codigo;
    private String nombre;
    private Integer cantidadmin;
    private Integer cantidadact;
    private Integer almacen;
    private Double preciounitario;
    private String fechaingreso;

    public Entrada() {
    }

    public Entrada(String id, String accion, String usuarioActual, String hora, String fechaMod, String codigo, String nombre, Integer cantidadmin, Integer cantidadact, Integer almacen, Double preciounitario, String fechaingreso) {
        this.id = id;
        this.accion = accion;
        this.usuarioActual = usuarioActual;
        this.hora = hora;
        this.fechaMod = fechaMod;
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidadmin = cantidadmin;
        this.cantidadact = cantidadact;
        this.almacen = almacen;
        this.preciounitario = preciounitario;
        this.fechaingreso = fechaingreso;
    }

    public void setFechaMod(String fechaMod){
        this.fechaMod = fechaMod;
    }
    
    public String getFechaMod(){
        return fechaMod;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(String usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
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
        return "Entrada{" +
                "id='" + id + '\'' +
                ", accion='" + accion + '\'' +
                ", usuarioActual='" + usuarioActual + '\'' +
                ", hora='" + hora + '\'' +
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
