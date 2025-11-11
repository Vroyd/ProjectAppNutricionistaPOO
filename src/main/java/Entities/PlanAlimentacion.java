package Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "PlanAlimentacion")
public class PlanAlimentacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlan;
    
    @ManyToOne
    @JoinColumn(name = "id_nutricionista")
    private Nutricionista nutricionista;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    private String nombre;
    private String descripcion;
    
    @Column(name = "fechaCreacion")
    private String fechaCreacion;
    
    private boolean activo;
    
    @OneToOne(mappedBy = "planAlimentacion", cascade = CascadeType.ALL)
    private DietaCliente dietaCliente;
    
    public PlanAlimentacion() {
    }

    public PlanAlimentacion(int idPlan, Nutricionista nutricionista, Cliente cliente, String nombre, 
                           String descripcion, String fechaCreacion, boolean activo) {
        this.idPlan = idPlan;
        this.nutricionista = nutricionista;
        this.cliente = cliente;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.activo = activo;
    }
    
    // Getters y Setters
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
    public String getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public DietaCliente getDietaCliente() {
        return dietaCliente;
    }
    public void setDietaCliente(DietaCliente dietaCliente) {
        this.dietaCliente = dietaCliente;
    }
}