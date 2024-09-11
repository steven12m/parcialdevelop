import java.util.Scanner;

public class SumaPrimerosNPares {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un número entero n
        System.out.print("Ingrese un número entero n: ");
        int n = scanner.nextInt();
        
        // Variable para almacenar la suma de los primeros n números pares
        int suma = 0;
        
        // Contador para los primeros n números pares
        int contador = 0;
        
        // Número actual que vamos a verificar si es par
        int numeroActual = 2;
        
        // Sumar los primeros n números pares
        while (contador < n) {
            // Verificar si el número actual es menor o igual a n
            if (numeroActual <= n) {
                // Sumar el número par a la variable suma
                suma += numeroActual;
                
                // Incrementar el contador de números pares sumados
                contador++;
            }
            
            // Pasar al siguiente número par
            numeroActual += 2;
        }
        
        // Mostrar el resultado de la suma
        System.out.println("La suma de los primeros " + n + " números pares es: " + suma);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}

