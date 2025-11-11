package Entities;

import Utils.ValidatorGeneral;

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
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
