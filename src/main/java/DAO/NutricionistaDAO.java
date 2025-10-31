package DAO;

import Entities.Nutricionista;  // Entidad Nutricionista
import Utils.JpaUtil;       // Utilidad para obtener EntityManager
import jakarta.persistence.EntityManager;       // EntityManager de JPA
import jakarta.persistence.EntityTransaction;   // Para manejar transacciones

// DAO específico para Nutricionista que hereda de GenericDAO
public class NutricionistaDAO extends GenericDAO<Nutricionista> {
    
    // Constructor
    public NutricionistaDAO() {
        super(Nutricionista.class);     // Llama al constructor del GenericDAO pasando la clase Nutricionista
    }
    
    // Método para cambiar el estado activo/desactivado de un nutricionista
    public void cambiarEstado(int id, boolean nuevoEstado) {
        EntityManager em = JpaUtil.getEntityManager();  // Obtiene EntityManager
        EntityTransaction tx = em.getTransaction();     // Obtiene la transacción

        try {
            tx.begin();     // Inicia la transacción
            Nutricionista nutricionista = em.find(Nutricionista.class, id);     // Busca el nutricionista por ID
            if (nutricionista != null) {    // Si se encuentra
                nutricionista.setActivo(nuevoEstado);   // Cambia el estado
                em.merge(nutricionista);    // Actualiza la entidad en la base de datos
            }
            tx.commit();    // Confirma la transacción
        } catch (Exception e) { // Captura cualquier excepción
            if (tx.isActive()) tx.rollback();   // Revierte cambios si hubo error
            e.printStackTrace();    // Imprime el error
        } finally {
            em.close();     // Cierra EntityManager para liberar recursos
        }
    }
}
