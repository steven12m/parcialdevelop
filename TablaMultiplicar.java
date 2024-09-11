import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese el número para la tabla de multiplicar
        System.out.print("Ingrese un número entero para generar su tabla de multiplicar: ");
        int n = scanner.nextInt();
        
        // Generar y mostrar la tabla de multiplicar del número n
        generarTablaMultiplicar(n);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para generar y mostrar la tabla de multiplicar de un número
    public static void generarTablaMultiplicar(int n) {
        System.out.println("Tabla de multiplicar del número " + n + ":");
        
        // Iterar del 1 al 10 para generar la tabla de multiplicar
        for (int i = 1; i <= 10; i++) {
            int resultado = n * i;
            System.out.println(n + " x " + i + " = " + resultado);
        }
    }
}
