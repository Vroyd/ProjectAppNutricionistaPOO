package DAO;

import Entities.PlanAlimentacion;   // Entidad PlanAlimentacion
import Utils.JpaUtil;       // Utilidad para obtener EntityManager
import jakarta.persistence.EntityManager;   // EntityManager de JPA
import jakarta.persistence.EntityTransaction;   // Para manejar transacciones

// DAO específico para PlanAlimentacion que hereda de GenericDAO
public class PlanAlimentacionDAO extends GenericDAO<PlanAlimentacion> {
    
    // Constructor
    public PlanAlimentacionDAO() {
        super(PlanAlimentacion.class);  // Llama al constructor de GenericDAO pasando la clase PlanAlimentacion
    }
    
    // Método para cambiar el estado activo/desactivado de un plan
    public void cambiarEstado(int idPlan, boolean nuevoEstado) {
        EntityManager em = JpaUtil.getEntityManager();  // Obtiene el EntityManager
        EntityTransaction tx = em.getTransaction();     // Obtiene la transacción asociada

        try {
            tx.begin();     // Inicia la transacción
            PlanAlimentacion plan = em.find(PlanAlimentacion.class, idPlan);    // Busca el plan por ID
            if (plan != null) {     // Si se encuentra
                plan.setActivo(nuevoEstado);    // Cambia el estado
                em.merge(plan);     // Actualiza la entidad en la base de datos
            }
            tx.commit();    // Confirma la transacción
        } catch (Exception e) {     // Captura cualquier excepción
            if (tx.isActive()) tx.rollback();   // Revierte cambios si hubo error
            e.printStackTrace();        // Imprime el error en consola
        } finally {
            em.close();     // Cierra el EntityManager
        }
    }
    
    // Metodo para buscar por nombre
    public PlanAlimentacion buscarPorNombre(String nombre) {
    EntityManager em = JpaUtil.getEntityManager();
    try {
        return em.createQuery("SELECT p FROM PlanAlimentacion p WHERE p.nombre = :nombre", PlanAlimentacion.class)
                 .setParameter("nombre", nombre)
                 .getSingleResult();
    } catch (Exception e) {
        return null;
    } finally {
        em.close();
    }
}
    
}
