package com.aquitectura.hexagonal.infraestructura.persistencia.repositorio;

import com.aquitectura.hexagonal.dominio.Producto;
import com.aquitectura.hexagonal.dominio.repositorio.RepositorioProducto;
import com.aquitectura.hexagonal.infraestructura.persistencia.entidad.ProductoEntity;
import com.aquitectura.hexagonal.infraestructura.persistencia.repositorio.jpa.RepositorioProductoJPA;

public class RepositorioProductoMongo implements RepositorioProducto, RepositorioProductoJPA {
    @Override
    public Producto obtenerPorCodigo(String codigo) {
        return null;
    }

    @Override
    public void agregar(Producto producto) {

    }

    @Override
    public ProductoEntity obtenerProductoEntityPorCodigo(String codigo) {
        return null;
    }
}
