package Validator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Pattern;

public class ValidatorGeneral {
    
    // Patrones de validación como constantes
    private static final Pattern EMAIL_PATTERN = 
        Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    private static final Pattern SOLO_LETRAS_PATTERN = 
        Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$");
    private static final Pattern SOLO_NUMEROS_PATTERN = 
        Pattern.compile("^\\d+$");
    private static final DateTimeFormatter DATE_FORMATTER = 
        DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    public static boolean validarTextoNoVacio(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    public static boolean validarSoloLetras(String texto) {
        return validarTextoNoVacio(texto) && SOLO_LETRAS_PATTERN.matcher(texto).matches();
    }

    public static boolean validarSoloNumeros(String texto) {
        return validarTextoNoVacio(texto) && SOLO_NUMEROS_PATTERN.matcher(texto).matches();
    }

    public static boolean validarNumPositivo(int num) {
        return num >= 0;
    }
    
    public static boolean validarEmail(String email) {
        return validarTextoNoVacio(email) && EMAIL_PATTERN.matcher(email).matches();
    }
    
    public static boolean validarTelefono(int telefono){
        return validarNumPositivo(telefono);
    };
    
    public static boolean validarDNI(int dni) {
            return validarNumPositivo(dni);
    }
    
    public static boolean validarDir(String direccion){
        return validarTextoNoVacio(direccion) &&
               validarSoloLetras(direccion);
    }
    
    public static boolean validarFormatoFecha(String fecha) {
        if (!validarTextoNoVacio(fecha)) return false;
        
        try {
            LocalDate.parse(fecha, DATE_FORMATTER);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
    
    public static boolean validarNombre(String nombre) {
        return validarTextoNoVacio(nombre) &&
               validarSoloLetras(nombre);
    }

    public static boolean validarApellido(String apellido) {
        return validarTextoNoVacio(apellido) &&
               validarSoloLetras(apellido);
    }

}
