import java.util.Scanner;

public class PiramideAsteriscos {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese el número de niveles
        System.out.print("Ingrese el número de niveles para la pirámide: ");
        int n = scanner.nextInt();
        
        // Dibujar la pirámide de asteriscos
        dibujarPiramide(n);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para dibujar la pirámide de asteriscos
    public static void dibujarPiramide(int n) {
        for (int i = 1; i <= n; i++) {
            // Imprimir espacios
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Nueva línea después de cada nivel
            System.out.println();
        }
    }
}
