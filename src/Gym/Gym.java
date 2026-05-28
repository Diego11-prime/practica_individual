package Gym;

import java.util.ArrayList;
import java.util.List;

public class Gym {

    private String rutina;
    private List<String> diasEntrenamiento;
    private List<String> consejosEntrenamiento;


    private List<String> tiposPesas;
    private List<String> usosEquipamiento;
    private List<Double> pesosDisponibles;


    public Gym() {

        this.rutina = "División 5 días: Pecho, Espalda, Piernas, Hombros, Brazos";

        this.diasEntrenamiento = new ArrayList<>();
        diasEntrenamiento.add("Lunes: Pecho y Tríceps");
        diasEntrenamiento.add("Martes: Espalda y Bíceps");
        diasEntrenamiento.add("Miércoles: Piernas");
        diasEntrenamiento.add("Jueves: Hombros y Core");
        diasEntrenamiento.add("Viernes: Fuerza General");
        diasEntrenamiento.add("Sábado: Cardio / Funcional");
        diasEntrenamiento.add("Domingo: Descanso");

        this.consejosEntrenamiento = new ArrayList<>();
        consejosEntrenamiento.add("Calienta 5-10 minutos antes de empezar");
        consejosEntrenamiento.add("Mantén buena técnica antes de aumentar el peso");
        consejosEntrenamiento.add("Controla tu respiración en cada ejercicio");
        consejosEntrenamiento.add("Aumenta la intensidad progresivamente");

        this.tiposPesas = new ArrayList<>();
        tiposPesas.add("Mancuernas: Desde 1kg hasta 50kg");
        tiposPesas.add("Barras olímpicas: 20kg (estándar)");
        tiposPesas.add("Discos de peso: 1.25kg, 2.5kg, 5kg, 10kg, 15kg, 20kg, 25kg");
        tiposPesas.add("Kettlebells: Para entrenamiento funcional");
        tiposPesas.add("Máquinas de fuerza: Ejercicios específicos");

        this.usosEquipamiento = new ArrayList<>();
        usosEquipamiento.add("Para desarrollar masa muscular");
        usosEquipamiento.add("Para mejorar la fuerza y resistencia");
        usosEquipamiento.add("Para definir grupos musculares");
        usosEquipamiento.add("Para rehabilitación y recuperación");

        this.pesosDisponibles = new ArrayList<>();
        pesosDisponibles.add(1.25);
        pesosDisponibles.add(2.5);
        pesosDisponibles.add(5.0);
        pesosDisponibles.add(10.0);
        pesosDisponibles.add(15.0);
        pesosDisponibles.add(20.0);
        pesosDisponibles.add(25.0);
        pesosDisponibles.add(50.0);
    }


    public void mostrarRutina() {
        System.out.println("\n📅 RUTINA DE ENTRENAMIENTO");
        System.out.println("---------------------------");
        System.out.println("Objetivo: " + rutina);
        System.out.println("\nDías de entrenamiento:");
        for (String dia : diasEntrenamiento) {
            System.out.println("  → " + dia);
        }
    }

    public void mostrarConsejos() {
        System.out.println("\n💡 CONSEJOS DE ENTRENAMIENTO");
        System.out.println("-----------------------------");
        for (String consejo : consejosEntrenamiento) {
            System.out.println("  ✅ " + consejo);
        }
    }

    public void mostrarPesas() {
        System.out.println("\n🏋️ TIPOS DE PESAS Y EQUIPAMIENTO");
        System.out.println("---------------------------------");
        for (String tipo : tiposPesas) {
            System.out.println("  → " + tipo);
        }

        System.out.println("\n⚖️ Pesos disponibles (en kg):");
        System.out.println("  " + pesosDisponibles);
    }

    public void mostrarUsos() {
        System.out.println("\n🎯 USOS DEL EQUIPAMIENTO");
        System.out.println("-------------------------");
        for (String uso : usosEquipamiento) {
            System.out.println("  → " + uso);
        }
    }
}