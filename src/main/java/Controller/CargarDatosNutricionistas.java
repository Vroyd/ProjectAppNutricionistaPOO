package Controller;

import DAO.NutricionistaDAO;        // DAO para manejar la persistencia de Nutricionista
import Entities.Nutricionista;  // Entidad Nutricionista
import java.sql.Timestamp;      // Para manejar fechas y horas
import java.util.List;          // Para manejar listas de nutricionistas

public class CargarDatosNutricionistas {

    private NutricionistaDAO nutricionistaDAO;      // Instancia del DAO para operaciones sobre nutricionistas

    public CargarDatosNutricionistas() {
        nutricionistaDAO = new NutricionistaDAO();      // Inicializa el DAO
    }

    // Crear un nuevo nutricionista
    public void crearNutricionista(String nombre, String apellido, String email, String telefono, String dni, String direccion) {
        try {
            Nutricionista nutricionista = new Nutricionista();      // Crea un objeto vacío
            nutricionista.setNombre(nombre);            // Asigna los valores recibidos
            nutricionista.setApellido(apellido);
            nutricionista.setEmail(email);
            nutricionista.setTelefono(telefono);
            nutricionista.setDni(dni);
            nutricionista.setDireccion(direccion); 
            nutricionista.setFechaRegistro(new Timestamp(System.currentTimeMillis())); // fecha actual
            nutricionista.setActivo(true);      // Por defecto activo

            nutricionistaDAO.crear(nutricionista);      // Guarda en la base de datos usando DAO
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear nutricionista: " + e.getMessage());      // Errores de validación
        } catch (Exception e) {
            System.out.println("Error inesperado al crear nutricionista: " + e.getMessage());       // Otros errores
        }
    }

    // Actualizar un nutricionista existente
    public void actualizarNutricionista(int id, String nombre, String apellido, String email, String telefono, String dni, String direccion) {
        Nutricionista nutricionista = nutricionistaDAO.buscarPorId(id);     // Busca por ID
        if (nutricionista != null) {    // Si existe
            try {
                // Actualiza los datos
                nutricionista.setNombre(nombre);
                nutricionista.setApellido(apellido);
                nutricionista.setEmail(email);
                nutricionista.setTelefono(telefono);
                nutricionista.setDni(dni);
                nutricionista.setDireccion(direccion); 

                nutricionistaDAO.actualizar(nutricionista);     // Guarda cambios en DB
            } catch (IllegalArgumentException e) {
                System.out.println("Error al actualizar nutricionista: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado al actualizar nutricionista: " + e.getMessage());
            }
        } else {    // Si no se encuentra el nutricionista
            System.out.println("Nutricionista con ID " + id + " no encontrado.");
        }
    }

    // Cambiar estado activo/desactivado
    public void cambiarEstadoNutricionista(int id, boolean activo) {
        try {
            nutricionistaDAO.cambiarEstado(id, activo);     // Llama al DAO
        } catch (Exception e) {
            System.out.println("Error al cambiar estado del nutricionista: " + e.getMessage());
        }
    }
    
    // Listar todos los nutricionistas
    public List<Nutricionista> listarNutricionista() {
        return nutricionistaDAO.listarTodos();      // Devuelve lista completa desde DAO
    }
    
}
