package Entities;

import jakarta.persistence.*;
import Validator.ValidatorGeneral;

@Entity
@Table(name = "Dieta")
public class DietaCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDieta;

    @ManyToOne
    @JoinColumn(name = "idPlan", nullable = false)
    private PlanAlimentacion plan;   // Relación con PlanAlimentacion

    @Column(nullable = false, length = 150)
    private String nombre;   // Desayuno, Almuerzo o Cena

    @Column(nullable = false, length = 150)
    private String ingrediente;

    @Column(length = 100)
    private String cantidad;

    // --- Constructores ---
    public DietaCliente() {}

    public DietaCliente(PlanAlimentacion plan, String nombre, String ingrediente, String cantidad) {
        this.plan = plan;
        this.nombre = nombre;
        this.ingrediente = ingrediente;
        this.cantidad = cantidad;
    }

    // --- Validación antes de guardar ---
    public boolean validarDatos() {
        return ValidatorGeneral.validarTextoNoVacio(nombre)
            && ValidatorGeneral.validarTextoNoVacio(ingrediente)
            && ValidatorGeneral.validarTextoNoVacio(cantidad);
    }

    // --- Getters y Setters ---
    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public PlanAlimentacion getPlan() {
        return plan;
    }

    public void setPlan(PlanAlimentacion plan) {
        this.plan = plan;
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

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
