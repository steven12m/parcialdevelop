import java.util.Scanner;

public class SerieAritmetica {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese el número de términos (n)
        System.out.print("Ingrese el número de términos (n): ");
        int n = scanner.nextInt();
        
        // Pedir al usuario que ingrese el primer término (a)
        System.out.print("Ingrese el primer término (a): ");
        int a = scanner.nextInt();
        
        // Pedir al usuario que ingrese la diferencia común (d)
        System.out.print("Ingrese la diferencia común (d): ");
        int d = scanner.nextInt();
        
        // Calcular la suma de los primeros n términos
        int suma = calcularSumaSerieAritmetica(n, a, d);
        
        // Mostrar el resultado
        System.out.println("La suma de los primeros " + n + " términos de la serie aritmética es: " + suma);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para calcular la suma de los primeros n términos de una serie aritmética
    public static int calcularSumaSerieAritmetica(int n, int a, int d) {
        // Aplicar la fórmula de la suma de la serie aritmética
        return (n * (2 * a + (n - 1) * d)) / 2;
    }
}

