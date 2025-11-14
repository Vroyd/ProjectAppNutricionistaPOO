package Entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity     // Marcamos esta clase como una entidad de JPA
@Table(name = "PlanAlimentacion")       // Indicamos el nombre de la tabla en la base de datos
public class PlanAlimentacion {

    @Id     // Campo ID con autoincremento
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlan;

    @ManyToOne
    @JoinColumn(name = "idNutricionista", nullable = false)     // clave foránea obligatoria
    private Nutricionista nutricionista;

    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = false)       // clave foránea obligatoria
    private Cliente cliente;

    @Column(nullable = false)   // Nombre del plan, obligatorio
    private String nombre;

    @Column(length = 1000)  // Descripción opcional, hasta 1000 caracteres
    private String descripcion;

    @Temporal(TemporalType.TIMESTAMP)       // Fecha de creación del plan, se guarda como timestamp
    @Column(name = "fechaCreacion", nullable = false)
    private Date fechaCreacion = new Date();        // Se inicializa automáticamente con la fecha actual

    @Column(nullable = false)       // Indica si el plan está activo
    private boolean activo = true;

    // ======= Getters y Setters =======

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

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override               
    public String toString() {                       // Representación en texto del objeto. Se usa en los JComboBox o en tablas cuando se imprime el objeto como texto.                                       
        return nombre + " (" + cliente.getNombre() + ")";
    }
}
