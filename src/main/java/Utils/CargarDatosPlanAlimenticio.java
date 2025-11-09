package Utils;

import Entities.PlanAlimentacion;
import Entities.Nutricionista;
import Entities.Cliente;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.util.List;

public class CargarDatosPlanAlimenticio {
    public static PlanAlimentacion cargarDatosDesdeFormulario(List<JTextField> campos, Nutricionista nutricionista, Cliente cliente) {
        if (campos == null || campos.size() < 3) {
            throw new IllegalArgumentException("La lista de campos debe contener al menos 3 elementos");
        }
        
        String nombre = campos.get(0).getText().trim();
        String descripcion = campos.get(1).getText().trim();
        String fechaCreacion = campos.get(2).getText().trim();
        
        PlanAlimentacion plan = new PlanAlimentacion(
            0,                    // idPlan (se genera automáticamente)
            nutricionista,        // nutricionista
            cliente,              // cliente
            nombre,               // nombre
            descripcion,          // descripcion
            fechaCreacion,        // fechaCreacion
            true                  // activo
        );
        
        return plan;
    }
    

    public static boolean validarYMostrarErrores(PlanAlimentacion plan) {
        if (plan.validarDatos()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, 
                "Errores de validación en los datos del plan alimenticio", 
                "Error de Validación", 
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
   
    public static PlanAlimentacion cargarYValidarDatos(List<JTextField> campos, Nutricionista nutricionista, Cliente cliente) {
        try {
            PlanAlimentacion plan = cargarDatosDesdeFormulario(campos, nutricionista, cliente);
            
            if (validarYMostrarErrores(plan)) {
                return plan;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                "Error al cargar datos: " + e.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
        
        return null;
    }
}