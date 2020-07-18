package com.aquitectura.hexagonal.aplicacion.comando;


public class ComandoProducto {

    private Long id;
    private String codigo;
    private String nombre;
    private double precio;

    public ComandoProducto(String codigo, String nombre, double precio) {
        this.id=id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Long getId() { return id; }
}

