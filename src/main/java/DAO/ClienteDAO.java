package DAO;

import Entities.Cliente;    // Entidad Cliente
import Utils.JpaUtil;       // Utilidad para obtener EntityManager
import jakarta.persistence.EntityManager;   // JPA EntityManager para operaciones con la BD
import jakarta.persistence.EntityTransaction;   // Para manejar transacciones

// DAO específico de Cliente que hereda de GenericDAO
public class ClienteDAO extends GenericDAO<Cliente> {
    
    // Constructor
    public ClienteDAO() {
        super(Cliente.class);   // Llama al constructor del GenericDAO pasando la clase Cliente
    }
    
    // Método para cambiar el estado activo/desactivado de un cliente
    public void cambiarEstado(int id, boolean nuevoEstado) {
        EntityManager em = JpaUtil.getEntityManager();      // Obtiene un EntityManager para la operación
        EntityTransaction tx = em.getTransaction();         // Obtiene la transacción asociada

        try {
            tx.begin();     // Inicia la transacción
            Cliente cliente = em.find(Cliente.class, id);   // Busca el cliente por ID en la BD
            if (cliente != null) {          // Si se encontró
                cliente.setActivo(nuevoEstado);     // Cambia el estado
                em.merge(cliente);              // Actualiza la entidad en la BD
            }
            tx.commit();        // Confirma la transacción
        } catch (Exception e) {     // Captura cualquier excepción
            if (tx.isActive()) tx.rollback();       // Si ocurrió un error y la transacción está activa, la revierte
            e.printStackTrace();            // Imprime el error en consola
        } finally {
            em.close();     // Cierra el EntityManager para liberar recursos
        }
    }
}
