package Entities;

import Utils.ValidatorGeneral;

public class Nutricionista extends Persona {
    private String direccion;

    public Nutricionista() {    
        super();
    }

    public Nutricionista(int id, String nombre, String apellido, String email, int telefono, 
                        int dni, String fecha, boolean activo, String direccion) {
        super(id, nombre, apellido, email, telefono, dni, fecha, activo);
        this.direccion = direccion;
    }
    
    @Override
    public boolean validarDatos() {
        return super.validarDatos() &&
        ValidatorGeneral.validarDir(direccion);
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
