package Controller;

import DAO.PlanAlimentacionDAO;
import Entities.PlanAlimentacion;
import Entities.Cliente;
import Entities.Nutricionista;
import java.sql.Timestamp;

public class CargarDatosPlanes {

    private PlanAlimentacionDAO planDAO;

    public CargarDatosPlanes() {
        planDAO = new PlanAlimentacionDAO();
    }

    // Crear nuevo plan
    public void crearPlan(Nutricionista nutricionista, Cliente cliente, String nombre, String descripcion) {
        try {
            PlanAlimentacion plan = new PlanAlimentacion();
            plan.setNutricionista(nutricionista);
            plan.setCliente(cliente);
            plan.setNombre(nombre);
            plan.setDescripcion(descripcion);
            plan.setFechaCreacion(new Timestamp(System.currentTimeMillis()));
            plan.setActivo(true);

            planDAO.crear(plan);
        } catch (Exception e) {
            System.out.println("Error al crear plan: " + e.getMessage());
        }
    }

    // Actualizar plan existente
    public void actualizarPlan(PlanAlimentacion plan) {
        try {
            planDAO.actualizar(plan);
        } catch (Exception e) {
            System.out.println("Error al actualizar plan: " + e.getMessage());
        }
    }

    // Cambiar estado (activo/inactivo)
    public void cambiarEstadoPlan(int idPlan, boolean activo) {
        planDAO.cambiarEstado(idPlan, activo);
    }

    // buscar plan por ID
    public PlanAlimentacion buscarPlanPorId(int idPlan) {
        return planDAO.buscarPorId(idPlan);
    }
}
