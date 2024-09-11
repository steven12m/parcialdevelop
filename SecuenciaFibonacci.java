import java.util.Scanner;

public class SecuenciaFibonacci {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese el número de términos
        System.out.print("Ingrese el número de términos de la secuencia de Fibonacci: ");
        int n = scanner.nextInt();
        
        // Validar que el número de términos sea positivo
        if (n <= 0) {
            System.out.println("El número de términos debe ser mayor que 0.");
        } else {
            // Generar y mostrar la secuencia de Fibonacci
            generarFibonacci(n);
        }
        
        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para generar los primeros n términos de la secuencia de Fibonacci
    public static void generarFibonacci(int n) {
        // Variables para almacenar los dos últimos términos de la secuencia
        long a = 0;
        long b = 1;
        
        // Mostrar los primeros n términos de la secuencia
        System.out.println("Los primeros " + n + " términos de la secuencia de Fibonacci son:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            // Calcular el siguiente término
            long siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println(); // Salto de línea al final de la secuencia
    }
}

