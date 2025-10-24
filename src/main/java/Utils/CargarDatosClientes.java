package Utils;

import Entities.Cliente;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.util.List;

public class CargarDatosClientes {
    public static Cliente cargarDatosDesdeFormulario(List<JTextField> campos) {
        if (campos == null || campos.size() < 9) {
            throw new IllegalArgumentException("La lista de campos debe contener al menos 9 elementos");
        }
        
        String nombre = campos.get(0).getText().trim();
        String apellido = campos.get(1).getText().trim();
        String dni = campos.get(2).getText().trim();
        String telefono = campos.get(3).getText().trim();
        String email = campos.get(4).getText().trim();
        String observaciones = campos.get(5).getText().trim();
        String fechaRegistro = campos.get(6).getText().trim();
        
        Cliente cliente = new Cliente(
            observaciones,
            fechaRegistro,
            0,
            nombre,
            apellido,
            email,
            telefono,
            dni,
            true
        );
        
        return cliente;
    }
    

    public static boolean validarYMostrarErrores(Cliente cliente) {
        if (cliente.validarDatos()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, 
                "Errores de validación:", 
                "Error de Validación", 
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
   
    public static Cliente cargarYValidarDatos(List<JTextField> campos) {
        try {
            Cliente cliente = cargarDatosDesdeFormulario(campos);
            
            if (validarYMostrarErrores(cliente)) {
                return cliente;
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