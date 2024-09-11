import java.util.Scanner;

public class NumeroPerfecto {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        int n = scanner.nextInt();
        
        // Verificar si el número es perfecto
        boolean esPerfecto = esNumeroPerfecto(n);
        
        // Mostrar el resultado
        if (esPerfecto) {
            System.out.println(n + " es un número perfecto.");
        } else {
            System.out.println(n + " no es un número perfecto.");
        }
        
        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para verificar si un número es perfecto
    public static boolean esNumeroPerfecto(int n) {
        // Los números menores o iguales a 1 no son números perfectos
        if (n <= 1) {
            return false;
        }
        
        int sumaDivisores = 0;
        
        // Encontrar todos los divisores propios de n
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sumaDivisores += i;
            }
        }
        
        // Comparar la suma de los divisores con el número n
        return sumaDivisores == n;
    }
}

