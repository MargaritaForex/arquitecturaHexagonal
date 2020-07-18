package com.aquitectura.hexagonal.aplicacion.manejadores.producto;

import com.aquitectura.hexagonal.dominio.Producto;
import com.aquitectura.hexagonal.dominio.servicio.producto.ServicioObtenerProducto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ManejadorObtenerProducto {

	private final ServicioObtenerProducto servicioObtenerProducto;

	public ManejadorObtenerProducto(ServicioObtenerProducto servicioObtenerProducto) {
		this.servicioObtenerProducto = servicioObtenerProducto;
	}

	@Transactional
	public Producto ejecutar(String codigo) {
	 return	this.servicioObtenerProducto.ejecutar(codigo);
	}
}
