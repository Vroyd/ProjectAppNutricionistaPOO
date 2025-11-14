package Entities;   // Indica que esta clase pertenece al paquete Entities

import jakarta.persistence.*;   // Importa las anotaciones y clases necesarias de JPA
import java.sql.Timestamp;      // Permite manejar fecha y hora exactas con precisión


/**
 * Entidad que representa a un Nutricionista dentro del sistema.
 * Extiende la clase Persona y agrega sus propios atributos (dirección y fechaRegistro).
 */
@Entity // Marca esta clase como entidad JPA
@Table(name = "Nutricionista")  // Nombre de la tabla asociada en la base de datos
@PrimaryKeyJoinColumn(name = "id") // Hereda la PK de Persona
public class Nutricionista extends Persona {        // Hereda atributos y métodos de Persona

    private String direccion;   // Dirección del nutricionista

    @Column(name = "fechaRegistro")     // Especifica el nombre de la columna en la tabla
    private Timestamp fechaRegistro;    // Fecha y hora en que el nutricionista fue registrado

    public Nutricionista() {    
    }

    public Nutricionista(int id, String nombre, String apellido, String email, String telefono, String dni, boolean activo,
                         String direccion, Timestamp fechaRegistro) {
        super(id, nombre, apellido, email, telefono, dni, activo);      // Inicializa los atributos heredados
        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;
    }

    // ===== Getters y Setters =====

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
