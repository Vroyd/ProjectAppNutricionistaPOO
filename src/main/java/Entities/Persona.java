package Entities;

import Utils.ValidatorGeneral;

public class Persona {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected int telefono;
    protected int dni;
    protected String fecha;
    protected boolean activo;
    
    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, String email, int telefono, int dni,String fecha, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.dni = dni;
        this.fecha = fecha;
        this.activo = activo;
    }
    
<<<<<<< Updated upstream
    public boolean validarDatos() {
        return ValidatorGeneral.validarNombre(nombre) &&
               ValidatorGeneral.validarApellido(apellido) &&
               ValidatorGeneral.validarEmail(email) &&
               ValidatorGeneral.validarTelefono(telefono) &&
               ValidatorGeneral.validarFormatoFecha(fecha) &&
               ValidatorGeneral.validarDNI(dni);
    }
   
=======
>>>>>>> Stashed changes
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
    
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
