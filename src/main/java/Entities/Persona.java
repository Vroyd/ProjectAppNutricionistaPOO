package Entities;   // Indica que esta clase pertenece al paquete Entities

import jakarta.persistence.*;   // Importa las anotaciones necesarias de JPA

@Entity     // Indica que la clase es una entidad JPA
@Inheritance(strategy = InheritanceType.JOINED)     // Define el tipo de herencia: cada subclase tendrá su propia tabla unida por la PK
@Table(name = "Persona")        // Asocia la clase con la tabla "Persona" en la base de datos

public class Persona {
    
    @Id     // Marca el campo como clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // Indica que el valor del ID será autogenerado por la base de datos (auto-incremental)
    protected int id;   // Identificador único de la persona
    
    @Column(nullable = false)   // No permite valores nulos en esta columna
    protected String nombre;    // Nombre de la persona
    
    @Column(nullable = false)   // No permite valores nulos en esta columna
    protected String apellido;  // Apellido de la persona
    
    
    protected String email;     // Correo electrónico (puede ser nulo)
    protected String telefono;      // Teléfono de contacto (puede ser nulo)
    protected String dni;       // Documento Nacional de Identidad
    protected boolean activo;   // Indica si la persona está activa o no
    
     /**
     * Constructor vacío requerido por JPA.
     * Permite que el framework cree instancias automáticamente al leer desde la base de datos.
     */
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
