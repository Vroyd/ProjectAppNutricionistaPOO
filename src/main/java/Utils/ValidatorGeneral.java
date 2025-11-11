package Utils;

public class ValidatorGeneral {
    
    public static boolean validarTexto(String texto) {
        try {
            return texto != null && !texto.trim().isEmpty();
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean validarEnteroPositivo(String numeroStr) {
        try {
            int num = Integer.parseInt(numeroStr);
            return num >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}