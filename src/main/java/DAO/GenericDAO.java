package DAO;

import Utils.JpaUtil;       // Utilidad para obtener EntityManager
import jakarta.persistence.EntityManager;   // EntityManager de JPA
import jakarta.persistence.EntityTransaction;   // Para manejar transacciones
import java.util.List;      // Para devolver listas de entidades

// Clase abstracta genérica para operaciones CRUD
public abstract class GenericDAO<T> {

    private Class<T> entityClass;       // Guarda la clase de la entidad que maneja el DAO
    
    // Constructor recibe la clase de la entidad
    public GenericDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }
    
    // Crear una nueva entidad
    public void crear(T entidad) {
        EntityManager em = JpaUtil.getEntityManager();  // Obtener EntityManager
        EntityTransaction tx = em.getTransaction();     // Obtener transacción

        try {
            tx.begin();     // Inicia la transacción
            em.persist(entidad);    // Persiste la entidad en la base de datos
            tx.commit();        // Confirma la transacción
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();   // Si falla, revierte cambios
            e.printStackTrace();        // Imprime el error
        } finally {
            em.close();     // Cierra EntityManager
        }
    }
    
    // Actualizar una entidad existente
    public void actualizar(T entidad) {
        EntityManager em = JpaUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            em.merge(entidad);      // Merge actualiza la entidad en la base de datos
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
    
    // Buscar una entidad por su ID
    public T buscarPorId(int id) {
        EntityManager em = JpaUtil.getEntityManager();
        return em.find(entityClass, id);    // Busca la entidad usando su clase y ID
    }
    
    // Listar todas las entidades de ese tipo
    public List<T> listarTodos() {
        EntityManager em = JpaUtil.getEntityManager();
        return em.createQuery("SELECT e FROM " + entityClass.getSimpleName() + " e", entityClass).getResultList();  // Devuelve todos los registros de la entidad
    }
}

