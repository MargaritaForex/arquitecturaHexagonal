package com.aquitectura.hexagonal.aplicacion.manejadores.producto;

import com.aquitectura.hexagonal.aplicacion.comando.ComandoProducto;
import com.aquitectura.hexagonal.aplicacion.fabrica.FabricaProducto;
import com.aquitectura.hexagonal.dominio.Producto;
import com.aquitectura.hexagonal.dominio.servicio.producto.ServicioCrearProducto;
import com.aquitectura.hexagonal.dominio.servicio.producto.ServicioObtenerProducto;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ManejadorCrearProducto {

	private final ServicioCrearProducto servicioCrearProducto;
	private final ServicioObtenerProducto servicioObtenerProducto;
	private final FabricaProducto fabricaProducto;

	public ManejadorCrearProducto(ServicioCrearProducto servicioCrearProducto, FabricaProducto fabricaProducto,
								  ServicioObtenerProducto servicioObtenerProducto) {
		this.servicioCrearProducto = servicioCrearProducto;
		this.fabricaProducto = fabricaProducto;
		this.servicioObtenerProducto = servicioObtenerProducto;
	}

	@Transactional
	public void ejecutar(ComandoProducto comandoProducto) {
			if(servicioObtenerProducto.ejecutar(comandoProducto.getCodigo())==null){
				Producto producto = this.fabricaProducto.crearProducto(comandoProducto);
				this.servicioCrearProducto.ejecutar(producto);
			}
	}
}
