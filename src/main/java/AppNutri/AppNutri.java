package AppNutri;

import Forms.FormNutricionista;
import Utils.JpaUtil;
import jakarta.persistence.EntityManager;

import javax.swing.*;

public class AppNutri {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                // Look & Feel del sistema
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

                // Prueba mínima de conexión 
                try (EntityManager em = JpaUtil.getEntityManager()) {
                    em.createNativeQuery("SELECT 1").getSingleResult();
                    JOptionPane.showMessageDialog(null, "Conexión a la base de datos exitosa!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos:\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }

                // Abrir ventana principal
                FormNutricionista app = new FormNutricionista();
                app.setVisible(true);

                // Listener para cerrar correctamente la fábrica al salir
                app.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        JpaUtil.closeEntityManagerFactory();
                        System.exit(0);
                    }
                });

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
