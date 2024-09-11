import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese una cadena de texto
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();
        
        // Verificar si la cadena es un palíndromo
        boolean esPalindromo = esPalindromo(texto);
        
        // Mostrar el resultado
        if (esPalindromo) {
            System.out.println("La cadena de texto es un palíndromo.");
        } else {
            System.out.println("La cadena de texto no es un palíndromo.");
        }
        
        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para verificar si una cadena de texto es un palíndromo
    public static boolean esPalindromo(String texto) {
        // Eliminar espacios y convertir la cadena a minúsculas
        texto = texto.replaceAll("\\s+", "").toLowerCase();
        
        // Obtener la cadena invertida
        String textoInvertido = new StringBuilder(texto).reverse().toString();
        
        // Comparar la cadena original con la cadena invertida
        return texto.equals(textoInvertido);
    }
}

