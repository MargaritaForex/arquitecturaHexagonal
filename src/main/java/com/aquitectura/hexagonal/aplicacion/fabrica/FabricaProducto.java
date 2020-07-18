package com.aquitectura.hexagonal.aplicacion.fabrica;

import com.aquitectura.hexagonal.aplicacion.comando.ComandoProducto;
import com.aquitectura.hexagonal.dominio.Producto;
import org.springframework.stereotype.Component;

@Component
public class FabricaProducto {
    public Producto crearProducto(ComandoProducto comandoProducto){
        return new Producto(comandoProducto.getId(),comandoProducto.getCodigo(),comandoProducto.getNombre(),comandoProducto.getPrecio());
    }
}
