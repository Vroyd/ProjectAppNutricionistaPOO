package Utils;

import Entities.Nutricionista;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.util.List;

public class CargarDatosNutricionista {
    public static Nutricionista cargarDatosDesdeFormulario(List<JTextField> campos) {
        if (campos == null || campos.size() < 7) {
            throw new IllegalArgumentException("La lista de campos debe contener al menos 7 elementos");
        }
        
        String nombre = campos.get(0).getText().trim();
        String apellido = campos.get(1).getText().trim();
        String dni = campos.get(2).getText().trim();
        String telefono = campos.get(3).getText().trim();
        String email = campos.get(4).getText().trim();
        String direccion = campos.get(5).getText().trim();
        String fechaRegistro = campos.get(6).getText().trim();
        
        Nutricionista nutricionista = new Nutricionista(
            0,
            nombre,
            apellido,
            email,
            telefono,
            dni,
            true,
            fechaRegistro,
            direccion
        );
        
        return nutricionista;
    }
    

    public static boolean validarYMostrarErrores(Nutricionista nutricionista) {
        if (nutricionista.validarDatos()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, 
                "Errores de validación:", 
                "Error de Validación", 
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
   
    public static Nutricionista cargarYValidarDatos(List<JTextField> campos) {
        try {
            Nutricionista nutricionista = cargarDatosDesdeFormulario(campos);
            
            if (validarYMostrarErrores(nutricionista)) {
                return nutricionista;
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
