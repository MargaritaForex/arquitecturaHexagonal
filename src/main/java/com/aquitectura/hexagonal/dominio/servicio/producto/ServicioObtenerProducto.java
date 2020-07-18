package com.aquitectura.hexagonal.dominio.servicio.producto;

import com.aquitectura.hexagonal.dominio.Producto;
import com.aquitectura.hexagonal.dominio.repositorio.RepositorioProducto;
import org.springframework.stereotype.Component;

@Component
public class ServicioObtenerProducto {

	private RepositorioProducto repositorioProducto;

	public ServicioObtenerProducto(RepositorioProducto repositorioProducto) {
		this.repositorioProducto = repositorioProducto;
	}

	public Producto ejecutar(String codigo) {
			return this.repositorioProducto.obtenerPorCodigo(codigo);
	}
}
