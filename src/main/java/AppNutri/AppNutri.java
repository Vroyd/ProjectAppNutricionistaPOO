package AppNutri;

import Forms.FormNutricionista;
import Utils.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import javax.swing.*;

public class AppNutri extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                // Establecer Look & Feel del sistema
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

                // Probar conexión a la base de datos
                EntityManager em = null;
                EntityTransaction tx = null;
                try {
                    em = JpaUtil.getEntityManager();
                    tx = em.getTransaction();
                    tx.begin();

                    // Prueba mínima de conexión
                    em.createNativeQuery("SELECT 1").getSingleResult();

                    tx.commit();

                    // Mensaje de éxito
                    JOptionPane.showMessageDialog(null, "Conexión a la base de datos exitosa!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    if (tx != null && tx.isActive()) {
                        tx.rollback();
                    }
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos:\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                } finally {
                    if (em != null) em.close();
                    JpaUtil.close();
                }

                // Abrir la ventana principal
                FormNutricionista app = new FormNutricionista();
                app.setVisible(true);

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
