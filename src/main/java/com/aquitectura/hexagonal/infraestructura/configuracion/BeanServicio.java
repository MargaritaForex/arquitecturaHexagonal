package com.aquitectura.hexagonal.infraestructura.configuracion;

import com.aquitectura.hexagonal.dominio.repositorio.RepositorioProducto;
import com.aquitectura.hexagonal.dominio.servicio.vendedor.ServicioVendedor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {

	@Bean
	public ServicioVendedor servicioCrearUsuario(RepositorioProducto repositorioProducto) {
		return new ServicioVendedor(repositorioProducto);
	}
}
