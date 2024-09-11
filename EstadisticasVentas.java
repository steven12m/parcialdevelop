import java.util.Scanner;

public class EstadisticasVentas {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese el número de transacciones
        System.out.print("Ingrese el número de transacciones: ");
        int numTransacciones = scanner.nextInt();
        
        // Crear un array para almacenar las ventas
        double[] ventas = new double[numTransacciones];
        
        // Leer las ventas
        for (int i = 0; i < numTransacciones; i++) {
            System.out.print("Ingrese la venta de la transacción " + (i + 1) + ": ");
            ventas[i] = scanner.nextDouble();
        }
        
        // Calcular y mostrar las estadísticas
        calcularEstadisticas(ventas);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para calcular y mostrar las estadísticas de ventas
    public static void calcularEstadisticas(double[] ventas) {
        if (ventas.length == 0) {
            System.out.println("No hay transacciones para calcular estadísticas.");
            return;
        }
        
        double totalVentas = 0;
        double ventaMaxima = ventas[0];
        double ventaMinima = ventas[0];
        
        // Calcular total de ventas, venta máxima y mínima
        for (double venta : ventas) {
            totalVentas += venta;
            if (venta > ventaMaxima) {
                ventaMaxima = venta;
            }
            if (venta < ventaMinima) {
                ventaMinima = venta;
            }
        }
        
        // Calcular el promedio de ventas
        double promedioVentas = totalVentas / ventas.length;
        
        // Mostrar los resultados
        System.out.println("Total de ventas: " + totalVentas);
        System.out.println("Promedio de ventas por transacción: " + promedioVentas);
        System.out.println("Venta más alta: " + ventaMaxima);
        System.out.println("Venta más baja: " + ventaMinima);
    }
}
