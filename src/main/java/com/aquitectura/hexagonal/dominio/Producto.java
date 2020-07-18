package com.aquitectura.hexagonal.dominio;


public class Producto {
	private Long id;
	private String codigo;
	private String nombre;
	private double precio;

	public Producto(Long id,String codigo, String nombre, double precio) {
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

	public Long getId() { return id; }

	public double getPrecio() {
		return precio;
	}

}
