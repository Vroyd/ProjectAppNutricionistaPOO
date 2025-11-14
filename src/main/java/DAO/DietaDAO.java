package DAO;

import Entities.DietaCliente;
import Utils.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

public class DietaDAO extends GenericDAO<DietaCliente> {

    public DietaDAO() {
        super(DietaCliente.class);
    }

    // Crear una dieta
    @Override
    public void crear(DietaCliente dieta) {
        EntityManager em = JpaUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(dieta);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
            throw new RuntimeException("Error al crear la dieta", e);
        } finally {
            em.close();
        }
    }

    // Actualizar una dieta existente
    @Override
    public void actualizar(DietaCliente dieta) {
        EntityManager em = JpaUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(dieta);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
            throw new RuntimeException("Error al actualizar la dieta", e);
        } finally {
            em.close();
        }
    }

    // Buscar por ID
    public DietaCliente buscarPorId(int idDieta) {
        EntityManager em = JpaUtil.getEntityManager();
        try {
            return em.find(DietaCliente.class, idDieta);
        } finally {
            em.close();
        }
    }

    // Listar todas las dietas
    public List<DietaCliente> listarTodos() {
        EntityManager em = JpaUtil.getEntityManager();
        try {
            return em.createQuery("SELECT d FROM DietaCliente d", DietaCliente.class)
                     .getResultList();
        } finally {
            em.close();
        }
    }

    // Eliminar dieta
    public void eliminar(int idDieta) {
        EntityManager em = JpaUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            DietaCliente dieta = em.find(DietaCliente.class, idDieta);
            if (dieta != null) {
                em.remove(dieta);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
            throw new RuntimeException("Error al eliminar la dieta", e);
        } finally {
            em.close();
        }
    }
    
    
    
}
