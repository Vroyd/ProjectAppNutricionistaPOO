package AppNutri;
import Forms.FormNutricionista;
import javax.swing.*;

public class AppNutri extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           try {
               UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
           } catch (Exception e){
               e.printStackTrace();
           }
           FormNutricionista app = new FormNutricionista();
           app.setVisible(true);
        });
    }
}
