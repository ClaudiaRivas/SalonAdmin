package com.example.rivas.salon_rmr.Model;

public class Servicio {
    private String id;
    public String nombre;
    public String descripcion;
    public String precio;

    public Servicio(){

    }

    public Servicio(String id, String nombre, String descripcion, String precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() { return precio; }

    public void setPrecio(String precio) { this.precio = precio; }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
