package Entities;

import Utils.ValidatorGeneral;
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
    protected String fecha;
    protected boolean activo;
    
    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, String email, String telefono, String dni, String fecha, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.dni = dni;
        this.fecha = fecha;
        this.activo = activo;
    }
    
    public boolean validarDatos() {
        return ValidatorGeneral.validarNombre(nombre) &&
               ValidatorGeneral.validarApellido(apellido) &&
               ValidatorGeneral.validarEmail(email) &&
               ValidatorGeneral.validarFormatoFecha(fecha);
    }
   
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
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}