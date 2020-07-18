package com.aquitectura.hexagonal.infraestructura.configuracion.sistema;

import com.aquitectura.hexagonal.dominio.repositorio.RepositorioProducto;
import com.aquitectura.hexagonal.infraestructura.configuracion.conexion.ConexionJPA;
import com.aquitectura.hexagonal.infraestructura.persistencia.repositorio.RepositorioProductoPersistente;

import javax.persistence.EntityManager;

public class SistemaDePersistencia {

	private EntityManager entityManager;

	public SistemaDePersistencia() {
		this.entityManager = new ConexionJPA().createEntityManager();
	}

	public RepositorioProducto obtenerRepositorioProductos() {
		return new RepositorioProductoPersistente(entityManager);
	}

	public void iniciar() {
		entityManager.getTransaction().begin();
	}

	public void terminar() {
		entityManager.getTransaction().commit();
	}
}
