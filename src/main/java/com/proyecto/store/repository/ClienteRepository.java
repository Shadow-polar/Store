package com.proyecto.store.repository;

import com.proyecto.store.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio encargado de acceder a la tabla clientes.
 *
 * @author Alejandro
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
