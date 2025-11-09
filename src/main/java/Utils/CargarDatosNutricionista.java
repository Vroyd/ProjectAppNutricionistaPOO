package Utils;

import Entities.Nutricionista;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;

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
        String fechaNacimiento = campos.get(6).getText().trim(); // fecha de nacimiento
        
        // Fecha de registro se genera automáticamente
        Timestamp fechaRegistro = Timestamp.valueOf(LocalDateTime.now());
        
        Nutricionista nutricionista = new Nutricionista(
            0,                    // id (se genera automáticamente)
            nombre,              // nombre
            apellido,            // apellido
            email,               // email
            telefono,            // telefono
            dni,                 // dni
            fechaNacimiento,     // fecha (nacimiento)
            true,                // activo
            direccion,           // direccion
            fechaRegistro        // fechaRegistro
        );
        
        return nutricionista;
    }
    

    public static boolean validarYMostrarErrores(Nutricionista nutricionista) {
        if (nutricionista.validarDatos()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, 
                "Errores de validación en los datos del nutricionista", 
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