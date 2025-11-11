package Entities;

public class Cliente extends Persona{
    
    public Cliente(){
    }

    public Cliente(int id, String nombre, String apellido, String email, int telefono,String fecha, int dni, boolean activo) {
        super(id, nombre, apellido, email, telefono, dni, fecha,activo);
    }
<<<<<<< Updated upstream
    
    @Override
    public boolean validarDatos(){
        return super.validarDatos();
    }
}
=======

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
>>>>>>> Stashed changes
