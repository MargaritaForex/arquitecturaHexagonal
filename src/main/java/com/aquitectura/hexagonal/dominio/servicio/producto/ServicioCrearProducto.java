package com.aquitectura.hexagonal.dominio.servicio.producto;


import com.aquitectura.hexagonal.dominio.Producto;
import com.aquitectura.hexagonal.dominio.repositorio.RepositorioProducto;
import org.springframework.stereotype.Component;

@Component
public class ServicioCrearProducto {

	private RepositorioProducto repositorioProducto;

	public ServicioCrearProducto(RepositorioProducto repositorioProducto) {
		this.repositorioProducto = repositorioProducto;
	}

	public void ejecutar(Producto producto) {
		this.repositorioProducto.agregar(producto);
	}
}
