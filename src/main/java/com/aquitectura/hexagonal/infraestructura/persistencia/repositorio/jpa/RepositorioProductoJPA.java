package com.aquitectura.hexagonal.infraestructura.persistencia.repositorio.jpa;

import com.aquitectura.hexagonal.infraestructura.persistencia.entidad.ProductoEntity;

public interface RepositorioProductoJPA {

	/**
	 * Permite obtener un producto entity por un codigo
	 * @param codigo
	 * @return
	 */
	ProductoEntity obtenerProductoEntityPorCodigo(String codigo);

}
