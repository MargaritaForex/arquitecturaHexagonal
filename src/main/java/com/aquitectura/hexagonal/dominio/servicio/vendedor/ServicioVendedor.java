package com.aquitectura.hexagonal.dominio.servicio.vendedor;

import com.aquitectura.hexagonal.dominio.repositorio.RepositorioProducto;

public class ServicioVendedor {

    public static final String EL_PRODUCTO_TIENE_GARANTIA = "El producto ya cuenta con una garantía extendida";
    public static final String EL_PRODUCTO_NO_CUENTA_CON_GARANTIA = "Este producto no cuenta con garantía extendida";

    private RepositorioProducto repositorioProducto;

    public ServicioVendedor(RepositorioProducto repositorioProducto) {
        this.repositorioProducto = repositorioProducto;
    }
}
