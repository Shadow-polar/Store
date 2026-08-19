package com.proyecto.store.controller;

import com.proyecto.store.model.Cliente;
import com.proyecto.store.services.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;


/**
 * Controlador REST para administrar los clientes.
 *
 * @author Alejandro
 */
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    // Obtener todos los clientes
    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }

    // Obtener un cliente por ID
    @GetMapping("/{id}")
    public Cliente obtenerCliente(@PathVariable Long id) {
        return clienteService.obtenerClientePorId(id);
    }

    // Guardar un cliente
    @PostMapping
    public Cliente guardarCliente(@RequestBody Cliente cliente) {
        return clienteService.guardarCliente(cliente);
    }

    // Actualizar un cliente
    @PutMapping("/{id}")
    public Cliente actualizarCliente(@PathVariable Long id,
                                     @RequestBody Cliente cliente) {

        return clienteService.actualizarCliente(id, cliente);
    }

    // Eliminar un cliente
    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable Long id) {
        clienteService.eliminarCliente(id);
    }

}