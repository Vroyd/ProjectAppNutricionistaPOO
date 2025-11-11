package Entities;

import Utils.ValidatorGeneral;
<<<<<<< HEAD

public class Nutricionista extends Persona {
    private String direccion;

<<<<<<< Updated upstream
    public Nutricionista() {    
        super();
=======
    @Column(name = "fechaRegistro")
    private Timestamp fechaRegistro;

public Nutricionista() {    
>>>>>>> Stashed changes
    }

    public Nutricionista(int id, String nombre, String apellido, String email, int telefono, 
                        int dni, String fecha, boolean activo, String direccion) {
        super(id, nombre, apellido, email, telefono, dni, fecha, activo);
        this.direccion = direccion;
    }
    
<<<<<<< Updated upstream
    @Override
    public boolean validarDatos() {
        return super.validarDatos() &&
        ValidatorGeneral.validarDir(direccion);
    }
    
=======
>>>>>>> Stashed changes
=======
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Nutricionista")
@PrimaryKeyJoinColumn(name = "id")
public class Nutricionista extends Persona {

    private String direccion;

    @Column(name = "fechaRegistro")
    private Timestamp fechaRegistro;

    public Nutricionista() {    
    }

    public Nutricionista(int id, String nombre, String apellido, String email, String telefono, String dni, 
                        String fecha, boolean activo, String direccion, Timestamp fechaRegistro) {
        super(id, nombre, apellido, email, telefono, dni, fecha, activo);
        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;
    }
    
    @Override
    public boolean validarDatos() {
        return super.validarDatos() &&
               ValidatorGeneral.validarDir(direccion);
    }

>>>>>>> a7bfe15d75b2364c879fa03ac26c6d92c990af2a
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
<<<<<<< HEAD
}
=======

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
>>>>>>> a7bfe15d75b2364c879fa03ac26c6d92c990af2a
