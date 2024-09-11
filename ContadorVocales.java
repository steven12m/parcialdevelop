import java.util.Scanner;

public class ContadorVocales {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese una cadena de texto
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();
        
        // Contar las vocales en la cadena de texto
        int conteoVocales = contarVocales(texto);
        
        // Mostrar el resultado
        System.out.println("La cadena de texto contiene " + conteoVocales + " vocales.");
        
        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para contar las vocales en una cadena de texto
    public static int contarVocales(String texto) {
        int conteo = 0;
        // Convertir la cadena a minúsculas para facilitar la comparación
        texto = texto.toLowerCase();
        
        // Iterar sobre cada carácter de la cadena
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            // Verificar si el carácter es una vocal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                conteo++;
            }
        }
        
        return conteo;
    }
}
