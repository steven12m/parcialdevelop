import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese el primer número
        System.out.print("Ingrese el primer número entero (a): ");
        int a = scanner.nextInt();
        
        // Pedir al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo número entero (b): ");
        int b = scanner.nextInt();
        
        // Pedir al usuario que ingrese la operación
        System.out.print("Ingrese la operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);
        
        // Realizar la operación y mostrar el resultado
        try {
            double resultado = realizarOperacion(a, b, operacion);
            System.out.println("El resultado de " + a + " " + operacion + " " + b + " es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para realizar la operación según el operador
    public static double realizarOperacion(int a, int b, char operacion) {
        switch (operacion) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                // Manejar división por cero
                if (b == 0) {
                    throw new ArithmeticException("No se puede dividir por cero.");
                }
                return (double) a / b;
            default:
                throw new IllegalArgumentException("Operación no válida. Use +, -, * o /.");
        }
    }
}
