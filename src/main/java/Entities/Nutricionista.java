package Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Nutricionista")
@PrimaryKeyJoinColumn(name = "id") // Hereda la PK de Persona

public class Nutricionista extends Persona{

    public Nutricionista(){    
    }

    public Nutricionista(int id, String nombre, String apellido, String email, String telefono, String dni, boolean activo) {
        super(id, nombre, apellido, email, telefono, dni, activo);
    }
}
