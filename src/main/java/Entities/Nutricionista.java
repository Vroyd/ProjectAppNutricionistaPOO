package Entities;

public class Nutricionista extends Persona{

    public Nutricionista(){    
    }

    public Nutricionista(int id, String nombre, String apellido, String email, String telefono, String dni, boolean activo) {
        super(id, nombre, apellido, email, telefono, dni, activo);
    }
}
