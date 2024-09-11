import java.util.Scanner;

public class NumeroInvertido {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero n: ");
        int n = scanner.nextInt();
        
        // Invertir el número
        int numeroInvertido = invertirDigitos(n);
        
        // Mostrar el resultado
        System.out.println("El número invertido es: " + numeroInvertido);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para invertir los dígitos de un número
    public static int invertirDigitos(int n) {
        int numeroInvertido = 0;
        
        // Procesar cada dígito del número
        while (n != 0) {
            // Obtener el último dígito
            int digito = n % 10;
            // Construir el número invertido
            numeroInvertido = numeroInvertido * 10 + digito;
            // Eliminar el último dígito del número original
            n /= 10;
        }
        
        return numeroInvertido;
    }
}
