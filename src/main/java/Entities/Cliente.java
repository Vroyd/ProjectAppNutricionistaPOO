package Entities;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Cliente")
@PrimaryKeyJoinColumn(name = "id") // Hereda la PK de Persona
public class Cliente extends Persona {

    protected String direccion; // renombramos el atributo

    @Column(name = "fechaRegistro")
    protected Timestamp fechaRegistro;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String apellido, String email, String telefono, String dni, 
                   String fecha, boolean activo, String direccion, Timestamp fechaRegistro) {
        super(id, nombre, apellido, email, telefono, dni, fecha, activo);
        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;
    }

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