package com.aquitectura.hexagonal.infraestructura.persistencia.entidad;

import javax.persistence.*;

@Entity(name = "Producto")
@NamedQuery(name = "Producto.findByCodigo", query = "SELECT producto FROM Producto producto WHERE producto.codigo =:codigo")
public class ProductoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String codigo;
	
	@Column(nullable = false)
	private String nombre;

	@Column(nullable = false)
	private double precio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
