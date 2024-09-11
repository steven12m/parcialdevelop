import java.util.Scanner;

public class FactorialRecursivo {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero n: ");
        int n = scanner.nextInt();
        
        // Variable para almacenar el resultado del factorial
        long factorial = 1;
        
        // Calcular el factorial usando un bucle
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        // Mostrar el resultado
        System.out.println("El factorial de " + n + " es: " + factorial);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
