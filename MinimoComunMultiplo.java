import java.util.Scanner;

public class MinimoComunMultiplo {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese dos números enteros
        System.out.print("Ingrese el primer número entero a: ");
        int a = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número entero b: ");
        int b = scanner.nextInt();
        
        // Calcular el MCM usando el MCD
        int mcm = calcularMCM(a, b);
        
        // Mostrar el resultado
        System.out.println("El Mínimo Común Múltiplo de " + a + " y " + b + " es: " + mcm);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para calcular el MCD usando el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }

    // Método para calcular el MCM usando el MCD
    public static int calcularMCM(int a, int b) {
        // Manejar el caso cuando ambos números son 0
        if (a == 0 || b == 0) {
            return 0;
        }

        // Usar la fórmula MCM(a, b) = |a * b| / MCD(a, b)
        int mcd = calcularMCD(a, b);
        return Math.abs(a * b) / mcd;
    }
}

