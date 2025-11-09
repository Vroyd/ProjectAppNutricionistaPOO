package Entities;

import Utils.ValidatorGeneral;

public class DietaCliente {
    private int idDietaCliente;
    private String nombre;
    private String ingrediente;
    private String cantidad;
    
    public DietaCliente(){
    }

    public DietaCliente(int idDietaCliente, String nombre, String ingrediente, String Cantidad) {
        this.idDietaCliente = idDietaCliente;
        this.nombre = nombre;
        this.ingrediente = ingrediente;
        this.cantidad = Cantidad;
    }
    
    public boolean validarDatos(){
        return ValidatorGeneral.validarNombre(nombre) &&
               ValidatorGeneral.validarTextoNoVacio(ingrediente) &&
               ValidatorGeneral.validarTextoNoVacio(cantidad);
    }

    public int getIdDietaCliente() {
        return idDietaCliente;
    }

    public void setIdDietaCliente(int idDietaCliente) {
        this.idDietaCliente = idDietaCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.cantidad = Cantidad;
    }
}