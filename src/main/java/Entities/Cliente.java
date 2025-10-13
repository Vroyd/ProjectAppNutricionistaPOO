package Entities;

import java.sql.Timestamp;

public class Cliente extends Persona{
    protected String observaciones;
    protected Timestamp fechaRegistro;
    
    public Cliente(){
    }

    public Cliente(String observaciones, Timestamp fechaRegistro, int id, String nombre, String apellido, String email, String telefono, String dni, boolean activo) {
        super(id, nombre, apellido, email, telefono, dni, activo);
        this.observaciones = observaciones;
        this.fechaRegistro = fechaRegistro;
    }

    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }   
}
