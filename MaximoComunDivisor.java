import java.util.Scanner;

public class MaximoComunDivisor {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese dos números enteros
        System.out.print("Ingrese el primer número entero a: ");
        int a = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número entero b: ");
        int b = scanner.nextInt();
        
        // Calcular el MCD usando el algoritmo de Euclides
        int mcd = calcularMCD(a, b);
        
        // Mostrar el resultado
        System.out.println("El Máximo Común Divisor de " + a + " y " + b + " es: " + mcd);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para calcular el MCD usando el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {
        // Asegurarse de que a y b sean positivos
        a = Math.abs(a);
        b = Math.abs(b);

        // Algoritmo de Euclides
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }
}

