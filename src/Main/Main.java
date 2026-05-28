package Main;

import Gym.Gym;
import Comida.Comida;
import Descanso.Descanso;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Gym informacionGym = new Gym();
        Comida informacionComida = new Comida();
        Descanso informacionDescanso = new Descanso();

        int opcion;


        do {
            System.out.println("\n=====================================");
            System.out.println("          INFORMACIÓN DEL GIMNASIO  ");
            System.out.println("=====================================");
            System.out.println("1. Información sobre Entrenamiento");
            System.out.println("2. Alimentación y Nutrición");
            System.out.println("3. Descanso y Recuperación");
            System.out.println("4. Ver información del Gimnasio");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");


            while (!scanner.hasNextInt()) {
                System.out.print(" Ingresa un número válido: ");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("\n===== ENTRENAMIENTO =====");
                    informacionGym.mostrarRutina();
                    informacionGym.mostrarConsejos();
                    break;

                case 2:
                    System.out.println("\n===== ALIMENTACIÓN =====");
                    informacionComida.mostrarAgua();
                    informacionComida.mostrarAlimentos();
                    informacionComida.mostrarHorarios();
                    informacionComida.mostrarMacronutrientes();
                    break;

                case 3:
                    System.out.println("\n===== DESCANSO =====");
                    informacionDescanso.mostrarSuenio();
                    informacionDescanso.mostrarTecnicas();
                    informacionDescanso.mostrarBeneficios();
                    informacionDescanso.mostrarDias();
                    break;

                case 4:
                    System.out.println("\n===== TODO SOBRE EL GIMNASIO =====");
                    informacionGym.mostrarPesas();
                    informacionGym.mostrarUsos();
                    break;

                case 5:
                    System.out.println("\n ¡Gracias por consultar! Sigue entrenando y cuidándote.");
                    break;

                default:
                    System.out.println("\n Opción no válida, intenta de nuevo.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}