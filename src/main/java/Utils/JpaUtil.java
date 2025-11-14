package Utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class JpaUtil {

    // Singleton: solo una instancia de la fábrica
    private static EntityManagerFactory emf;

    private JpaUtil() {} // Evitar instancias directas
    
    /**
     * Devuelve una instancia única de {@link EntityManagerFactory}.
     * Si no existe o está cerrada, la crea usando la unidad de persistencia "NutricionPU".
     * 
     * @return instancia activa de {@code EntityManagerFactory}.
     */
    public static synchronized EntityManagerFactory getEntityManagerFactory() {
        if (emf == null || !emf.isOpen()) {
            emf = Persistence.createEntityManagerFactory("NutricionPU");
        }
        return emf;
    }
    
    public static EntityManager getEntityManager() {
        return getEntityManagerFactory().createEntityManager();
    }
    
    /**
     * Cierra la instancia de {@link EntityManagerFactory}, si está abierta.
     * <p>Debe invocarse al finalizar la aplicación para liberar los recursos de JPA.</p>
     */
    public static synchronized void closeEntityManagerFactory() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}
