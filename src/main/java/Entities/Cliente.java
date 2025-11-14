package Entities;   // Indica que esta clase pertenece al paquete Entities

import jakarta.persistence.*;   // Importa las anotaciones y clases necesarias para JPA
import java.sql.Timestamp;      // Importa la clase Timestamp para manejar fecha y hora

/**
 * Entidad que representa a un Cliente del sistema.
 * Hereda los atributos de la clase Persona y agrega campos específicos del cliente.
 */
@Entity     // Indica que esta clase es una entidad JPA (se mapea a una tabla en la BD)
@Table(name = "Cliente")    // Define el nombre de la tabla correspondiente en la base de datos
@PrimaryKeyJoinColumn(name = "id") // Hereda la PK de Persona
public class Cliente extends Persona {  // La clase Cliente hereda de Persona

    protected String direccion; // Dirección del cliente

    @Column(name = "fechaRegistro")     // Define el nombre de la columna en la base de datos
    protected Timestamp fechaRegistro;      // Fecha y hora en que se registró el cliente
    
    public Cliente() {
    }

    public Cliente(String direccion, Timestamp fechaRegistro, int id, String nombre, String apellido, String email, String telefono, String dni, boolean activo) {
        super(id, nombre, apellido, email, telefono, dni, activo);
        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;
    }
    
    // ====== Métodos Getters y Setters ======
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
