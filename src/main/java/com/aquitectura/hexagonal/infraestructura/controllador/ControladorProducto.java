package com.aquitectura.hexagonal.infraestructura.controllador;

import com.aquitectura.hexagonal.aplicacion.comando.ComandoProducto;
import com.aquitectura.hexagonal.aplicacion.manejadores.producto.ManejadorCrearProducto;
import com.aquitectura.hexagonal.aplicacion.manejadores.producto.ManejadorObtenerProducto;
import com.aquitectura.hexagonal.dominio.Producto;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/productos")
public class ControladorProducto {
		private final ManejadorCrearProducto manejadorCrearProducto;
		private final ManejadorObtenerProducto manejadorObtenerProducto;

	public ControladorProducto(ManejadorCrearProducto manejadorCrearProducto, ManejadorObtenerProducto manejadorObtenerProducto) {
		this.manejadorCrearProducto = manejadorCrearProducto;
		this.manejadorObtenerProducto = manejadorObtenerProducto;
	}

	@Transactional
	@PostMapping
		public void agregar(@RequestBody ComandoProducto comandoProducto) {
		this.manejadorCrearProducto.ejecutar(comandoProducto);
	}

	@GetMapping("/{id}")
		public Producto buscar(@PathVariable(name = "id") String codigo) {
		return this.manejadorObtenerProducto.ejecutar(codigo);
	}
}
