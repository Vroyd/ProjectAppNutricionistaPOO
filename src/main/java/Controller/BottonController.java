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
}
