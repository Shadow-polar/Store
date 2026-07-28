package com.proyecto.store.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Entidad que representa la tabla clientes de la base de datos.
 *
 * @author Alejandro
 */
@Entity
@Table(name = "clientes")
@Data
public class Cliente {

    // Llave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long idCliente;

    // Nombres del cliente
    @Column(nullable = false, length = 50)
    private String nombres;

    // Apellidos del cliente
    @Column(nullable = false, length = 50)
    private String apellidos;

    // Correo electrónico
    @Column(nullable = false, unique = true, length = 100)
    private String email;

    // Número de teléfono
    @Column(nullable = false, length = 15)
    private String telefono;

}
