package Entities;

public class Persona {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String telefono;
    protected String dni;
    protected boolean activo;
    
    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, String email, String telefono, String dni, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.dni = dni;
        this.activo = activo;
    }
    
    public boolean validarDatos() {
        return validarTextoNoVacio(nombre) &&
               validarTextoNoVacio(apellido) &&
               validarTextoNoVacio(email) &&
               validarTextoNoVacio(telefono) &&
               validarTextoNoVacio(dni);
    }

    protected boolean validarTextoNoVacio(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    protected boolean validarEmail(String email) {
        if (!validarTextoNoVacio(email)) return false;
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    protected boolean validarTelefono(String telefono) {
        if (!validarTextoNoVacio(telefono)) return false;
        return telefono.matches("\\d{8,15}");
    }

    protected boolean validarDNI(String dni) {
        if (!validarTextoNoVacio(dni)) return false;
        return dni.matches("\\d{8}");
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
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
