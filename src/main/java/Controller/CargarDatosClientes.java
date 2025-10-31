package Controller;

import DAO.ClienteDAO;      // Importa la clase DAO que maneja la persistencia de datos de Cliente
import Entities.Cliente;    // Importa la entidad Cliente
import java.sql.Timestamp;  // Importa Timestamp para manejar fechas y horas
import java.util.List;      // Importa List para manejar listas de clientes

public class CargarDatosClientes {

    private ClienteDAO clienteDAO;      // Instancia de ClienteDAO para interactuar con la base de datos
    
    // Constructor de la clase
    public CargarDatosClientes() {
        clienteDAO = new ClienteDAO();  // Inicializa el DAO
    }

    // Crear un nuevo cliente
    public void crearCliente(String nombre, String apellido, String email, String telefono, String dni, String direccion) {
        try {
            Cliente cliente = new Cliente();    // Crea un objeto Cliente vacío
            cliente.setNombre(nombre);          // Asigna los valores recibidos por parámetro
            cliente.setApellido(apellido);
            cliente.setEmail(email);
            cliente.setTelefono(telefono);
            cliente.setDni(dni);
            cliente.setDireccion(direccion);
            cliente.setFechaRegistro(new Timestamp(System.currentTimeMillis()));        // Marca la fecha de registro actual
            cliente.setActivo(true);    // Por defecto el cliente se crea como activo

            clienteDAO.crear(cliente);   // Llama al DAO para guardar el cliente en la base de datos
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear cliente: " + e.getMessage());    // Captura errores de validación
        } catch (Exception e) {
            System.out.println("Error inesperado al crear cliente: " + e.getMessage()); // Captura otros errores
        }
    }

    // Actualizar un cliente existente por ID y campos del form
    public void actualizarCliente(int id, String nombre, String apellido, String email, String telefono, String dni, String direccion) {
        Cliente cliente = clienteDAO.buscarPorId(id);    // Busca el cliente por ID
        if (cliente != null) {  // Si existe el cliente
            try {
                // Actualiza los datos del cliente
                cliente.setNombre(nombre);
                cliente.setApellido(apellido);
                cliente.setEmail(email);
                cliente.setTelefono(telefono);
                cliente.setDni(dni);
                cliente.setDireccion(direccion);

                clienteDAO.actualizar(cliente); // Llama al DAO para guardar los cambios
            } catch (IllegalArgumentException e) {
                System.out.println("Error al actualizar cliente: " + e.getMessage());   // Errores de validación
            } catch (Exception e) {
                System.out.println("Error inesperado al actualizar cliente: " + e.getMessage());    // Otros errores
            }
        } else {    // Si no existe el cliente
            System.out.println("Cliente con ID " + id + " no encontrado.");
        }
    }

    // Cambiar el estado activo/desactivado
    public void cambiarEstadoCliente(int id, boolean activo) {
        try {
            clienteDAO.cambiarEstado(id, activo);   // Llama al DAO para modificar el estado
        } catch (Exception e) {
            System.out.println("Error al cambiar estado del cliente: " + e.getMessage());
        }
    }
    
    // Método para obtener la lista completa de clientes
    public List<Cliente> listarClientes() {
        return clienteDAO.listarTodos();    // Llama al DAO para devolver todos los clientes
    }
}


