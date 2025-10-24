package Entities;

public class Cliente extends Persona{
    protected String observaciones;
    protected String fechaRegistro;
    
    public Cliente(){
    }

    public Cliente(String observaciones, String fechaRegistro, int id, String nombre, String apellido, String email, String telefono, String dni, boolean activo) {
        super(id, nombre, apellido, email, telefono, dni, activo);
        this.observaciones = observaciones;
        this.fechaRegistro = fechaRegistro;
    }
    
    @Override
    public boolean validarDatos(){
        return super.validarDatos() &&
        validarTextoNoVacio(observaciones) &&
        validarTextoNoVacio(fechaRegistro);
    }

    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public String getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }   
}
