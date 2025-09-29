
package Controladores;

import javax.swing.table.DefaultTableModel;

public class ControladorNutricionista {
    
    private DefaultTableModel tablaNutricionista;
    
       
    
    public void modificarNutricionista(int fila, String Nombre, String Apellido, String DNI, String Edad, String Telefono, String Email, String Direccion, String FechaRegistro){
        
        if(fila >=0 && fila < tablaNutricionista.getRowCount()){
            tablaNutricionista.setValueAt(Nombre, fila, 0);
            tablaNutricionista.setValueAt(Apellido, fila, 1);
            tablaNutricionista.setValueAt(DNI, fila, 2);
            tablaNutricionista.setValueAt(Telefono, fila, 3);
            tablaNutricionista.setValueAt(Email, fila, 4);
            tablaNutricionista.setValueAt(Direccion, fila, 5);
            tablaNutricionista.setValueAt(FechaRegistro, fila, 5);
        }
    
    }
    
}
