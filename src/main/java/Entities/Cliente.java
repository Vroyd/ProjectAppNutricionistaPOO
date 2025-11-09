package Entities;

public class Cliente extends Persona{
    
    public Cliente(){
    }

    public Cliente(int id, String nombre, String apellido, String email, int telefono,String fecha, int dni, boolean activo) {
        super(id, nombre, apellido, email, telefono, dni, fecha,activo);
    }
    
    @Override
    public boolean validarDatos(){
        return super.validarDatos();
    }
}
