package Controller;

import DAO.PlanAlimentacionDAO;     // DAO para manejar persistencia de PlanAlimentacion
import Entities.PlanAlimentacion;
import Entities.Cliente;
import Entities.Nutricionista;
import java.sql.Timestamp;

public class CargarDatosPlanes {

    private PlanAlimentacionDAO planDAO;    // Instancia del DAO para operaciones sobre planes

    public CargarDatosPlanes() {
        planDAO = new PlanAlimentacionDAO();    // Inicializa el DAO
    }
    
    // Método para crear un nuevo plan de alimentación
    public void crearPlan(Nutricionista nutricionista, Cliente cliente, String nombre, String descripcion) {
        try {
            PlanAlimentacion plan = new PlanAlimentacion(); // Crea un objeto vacío
            plan.setNutricionista(nutricionista);
            plan.setCliente(cliente);
            plan.setNombre(nombre);
            plan.setDescripcion(descripcion);
            plan.setFechaCreacion(new Timestamp(System.currentTimeMillis()));
            plan.setActivo(true);

            planDAO.crear(plan);    // Guarda el plan en la base de datos
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear plan: " + e.getMessage());       // Captura errores de validación
        }
    }
    
    // Método para actualizar un plan existente
    public void actualizarPlan(PlanAlimentacion plan) {
        try {
            planDAO.actualizar(plan);       // Actualiza el plan en la base de datos
        } catch (IllegalArgumentException e) {
            System.out.println("Error al actualizar plan: " + e.getMessage());
        }
    }
    
    // Método para cambiar el estado activo/desactivado de un plan
    public void cambiarEstadoPlan(int idPlan, boolean activo) {
        planDAO.cambiarEstado(idPlan, activo);      // Llama al DAO para modificar el estado
    }
}
