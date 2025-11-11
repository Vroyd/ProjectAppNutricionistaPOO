package Entities;

import Utils.ValidatorGeneral;
<<<<<<< HEAD

public class Persona {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected int telefono;
    protected int dni;
=======
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Persona")
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    
    @Column(nullable = false)
    protected String nombre;
    
    @Column(nullable = false)
    protected String apellido;
    
    protected String email;
    protected String telefono;
    protected String dni;
>>>>>>> a7bfe15d75b2364c879fa03ac26c6d92c990af2a
    protected String fecha;
    protected boolean activo;
    
    public Persona() {
    }

<<<<<<< HEAD
    public Persona(int id, String nombre, String apellido, String email, int telefono, int dni,String fecha, boolean activo) {
=======
    public Persona(int id, String nombre, String apellido, String email, String telefono, String dni, String fecha, boolean activo) {
>>>>>>> a7bfe15d75b2364c879fa03ac26c6d92c990af2a
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.dni = dni;
        this.fecha = fecha;
        this.activo = activo;
    }
    
<<<<<<< HEAD
<<<<<<< Updated upstream
=======
>>>>>>> a7bfe15d75b2364c879fa03ac26c6d92c990af2a
    public boolean validarDatos() {
        return ValidatorGeneral.validarNombre(nombre) &&
               ValidatorGeneral.validarApellido(apellido) &&
               ValidatorGeneral.validarEmail(email) &&
<<<<<<< HEAD
               ValidatorGeneral.validarTelefono(telefono) &&
               ValidatorGeneral.validarFormatoFecha(fecha) &&
               ValidatorGeneral.validarDNI(dni);
    }
   
=======
>>>>>>> Stashed changes
=======
               ValidatorGeneral.validarFormatoFecha(fecha);
    }
   
>>>>>>> a7bfe15d75b2364c879fa03ac26c6d92c990af2a
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
<<<<<<< HEAD
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
=======
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
>>>>>>> a7bfe15d75b2364c879fa03ac26c6d92c990af2a
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> a7bfe15d75b2364c879fa03ac26c6d92c990af2a
