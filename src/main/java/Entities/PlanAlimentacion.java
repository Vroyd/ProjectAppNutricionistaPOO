package Entities;

import java.sql.Timestamp;

public class PlanAlimentacion{
    int idPlan;
    Nutricionista nutricionista;
    Cliente cliente;
    String nombre;
    String descripcion;
    Timestamp fechaCreacion;
    boolean activo;
    
    public PlanAlimentacion(){
    }

    public PlanAlimentacion(int idPlan, Nutricionista nutricionista, Cliente cliente, String nombre, String descripcion, Timestamp fechaCreacion, boolean activo) {
        this.idPlan = idPlan;
        this.nutricionista = nutricionista;
        this.cliente = cliente;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.activo = activo;
    }

    public int getIdPlan() {
        return idPlan;
    }
    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }
    public Nutricionista getNutricionista() {
        return nutricionista;
    }
    public void setNutricionista(Nutricionista nutricionista) {
        this.nutricionista = nutricionista;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
}
