package Entities;

public class Nutricionista extends Persona {
    private String fechaRegistro;
    private String direccion;

    public Nutricionista() {    
        super();
    }

    public Nutricionista(int id, String nombre, String apellido, String email, String telefono, 
                        String dni, boolean activo, String fechaRegistro, String direccion) {
        super(id, nombre, apellido, email, telefono, dni, activo);
        this.fechaRegistro = fechaRegistro;
        this.direccion = direccion;
    }
    
    @Override
    public boolean validarDatos() {
        return super.validarDatos() &&
               validarTextoNoVacio(fechaRegistro)&&
               validarTextoNoVacio(direccion);
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
