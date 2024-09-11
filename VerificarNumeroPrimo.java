import java.util.Scanner;

public class VerificarNumeroPrimo {

    // Método para verificar si un número es primo
    public static boolean esPrimo(int n) {
        // Los números menores o iguales a 1 no son primos
        if (n <= 1) {
            return false;
        }
        
        // 2 y 3 son números primos
        if (n == 2 || n == 3) {
            return true;
        }
        
        // Eliminar múltiplos de 2 y 3
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        
        // Verificar divisibilidad desde 5 hasta la raíz cuadrada de n
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        
        // Si no se encontraron divisores, el número es primo
        return true;
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero n: ");
        int n = scanner.nextInt();
        
        // Verificar si el número es primo
        boolean resultado = esPrimo(n);
        
        // Mostrar el resultado
        if (resultado) {
            System.out.println(n + " es un número primo.");
        } else {
            System.out.println(n + " no es un número primo.");
        }
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
