package com.proyecto.store.services;

import com.proyecto.store.model.Cliente;
import java.util.List;

public interface ClienteService {

    List<Cliente> listarClientes();

    Cliente guardarCliente(Cliente cliente);

    Cliente obtenerClientePorId(Long id);

    Cliente actualizarCliente(Long id, Cliente cliente);

    void eliminarCliente(Long id);

}