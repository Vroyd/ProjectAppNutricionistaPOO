package Controller;

import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class BottonController {
    
    public static void insertarEnTabla(JTable tabla, List<JTextField> campos) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        
        for (JTextField campo : campos) {
            if (campo.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        Object[] fila = new Object[campos.size()];
        for (int i = 0; i < campos.size(); i++) {
            fila[i] = campos.get(i).getText().trim();
        }
        
        model.insertRow(1, fila);
    }
    
    public static void limpiarCampos(List<JTextField> campos) {
        for (JTextField campo : campos) {
            campo.setText("");
        }
    }
    
    public static void modificarNutricionista(JTable tabla, int fila, String Nombre, String Apellido, String DNI, String Telefono, String Email, String Direccion, String FechaRegistro){
        
        if(fila >=0 && fila < tabla.getRowCount()){
            tabla.setValueAt(Nombre, fila, 0);
            tabla.setValueAt(Apellido, fila, 1);
            tabla.setValueAt(DNI, fila, 2);
            tabla.setValueAt(Telefono, fila, 3);
            tabla.setValueAt(Email, fila, 4);
            tabla.setValueAt(Direccion, fila, 5);
            tabla.setValueAt(FechaRegistro, fila, 5);
        }
    
    }
    
    
    
}
