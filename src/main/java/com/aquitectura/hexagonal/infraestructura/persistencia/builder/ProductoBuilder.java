package com.aquitectura.hexagonal.infraestructura.persistencia.builder;

import com.aquitectura.hexagonal.dominio.Producto;
import com.aquitectura.hexagonal.infraestructura.persistencia.entidad.ProductoEntity;

public class ProductoBuilder {
	
	private ProductoBuilder() {}
	
	public static Producto convertirADominio(ProductoEntity productoEntity) {
		
		Producto producto = null;
		
		if(productoEntity != null) {
			producto = new Producto(productoEntity.getId(),productoEntity.getCodigo(), productoEntity.getNombre(), productoEntity.getPrecio());
		}
		
		return producto;
	}
	
	public static ProductoEntity convertirAEntity(Producto producto) {
		
		ProductoEntity productoEntity = new ProductoEntity();
		//productoEntity.setId(producto.getId());
		productoEntity.setCodigo(producto.getCodigo());
		productoEntity.setNombre(producto.getNombre());
		productoEntity.setPrecio(producto.getPrecio());
		
		return productoEntity;
	}
}
