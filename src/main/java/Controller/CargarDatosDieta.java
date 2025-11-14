package Controller;

import DAO.DietaDAO;
import Entities.DietaCliente;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CargarDatosDieta {

    private final DietaDAO dietaDAO;

    public CargarDatosDieta() {
        this.dietaDAO = new DietaDAO();
    }

    // --- Cargar todas las dietas en la tabla ---
    public void cargarTabla(JTable tabla) {
        List<DietaCliente> listaDietas = dietaDAO.listarTodos();

        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0); // limpiar tabla

        for (DietaCliente d : listaDietas) {
            Object[] fila = {
                d.getIdDieta(),
                d.getPlan(),
                d.getNombre(),
                d.getIngrediente(),
                d.getCantidad()
            };
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
        
        
    }

    // --- Guardar una nueva dieta ---
    public boolean guardarDieta(DietaCliente dieta) {
        if (!dieta.validarDatos()) {
            return false; // datos inválidos
        }
        dietaDAO.crear(dieta);
        return true;
    }

    // --- Actualizar una dieta existente ---
    public boolean actualizarDieta(DietaCliente dieta) {
        if (!dieta.validarDatos()) {
            return false;
        }
        dietaDAO.actualizar(dieta);
        return true;
    }

    // --- Eliminar una dieta ---
    public void eliminarDieta(int idDieta) {
        dietaDAO.eliminar(idDieta);
    }

    // --- Obtener una dieta por ID (opcional, para cuando haces clic en la tabla) ---
    public DietaCliente obtenerPorId(int id) {
        return dietaDAO.buscarPorId(id);
    }
    
    // --- Nuevo método para obtener lista de dietas ---
    public List<DietaCliente> listarTodas() {
        return dietaDAO.listarTodos();
    }
    
}
