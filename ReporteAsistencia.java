import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReporteAsistencia {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese el número de estudiantes
        System.out.print("Ingrese el número de estudiantes: ");
        int numEstudiantes = scanner.nextInt();
        
        // Crear un array para almacenar la asistencia (1 para presente, 0 para ausente)
        int[] asistencia = new int[numEstudiantes];
        
        // Leer el estado de asistencia de cada estudiante
        System.out.println("Ingrese 1 para presente y 0 para ausente:");
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Asistencia del estudiante " + (i + 1) + ": ");
            asistencia[i] = scanner.nextInt();
        }
        
        // Generar el reporte de asistencia
        generarReporte(asistencia);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para generar el reporte de asistencia
    public static void generarReporte(int[] asistencia) {
        int totalEstudiantes = asistencia.length;
        int cantidadPresentes = 0;
        int cantidadAusencias = 0;
        List<Integer> presentes = new ArrayList<>();
        
        // Contar presentes y ausentes
        for (int i = 0; i < totalEstudiantes; i++) {
            if (asistencia[i] == 1) {
                cantidadPresentes++;
                presentes.add(i + 1); // Guardar el número del estudiante presente
            } else {
                cantidadAusencias++;
            }
        }
        
        // Calcular el porcentaje de asistencia
        double porcentajeAsistencia = (totalEstudiantes > 0) 
            ? ((double) cantidadPresentes / totalEstudiantes) * 100 
            : 0;
        
        // Mostrar el reporte
        System.out.println("Reporte de Asistencia:");
        System.out.println("Porcentaje de asistencia: " + porcentajeAsistencia + "%");
        System.out.println("Número de ausencias: " + cantidadAusencias);
        System.out.println("Lista de estudiantes presentes: " + presentes);
    }
}
