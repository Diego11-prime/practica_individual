package Comida;

import java.util.ArrayList;
import java.util.List;

public class Comida {

    private int litrosAguaDiarios;
    private List<String> alimentosRecomendados;
    private List<String> horariosComida;
    private List<String> macronutrientes;


    public Comida() {
        this.litrosAguaDiarios = 3;

        this.alimentosRecomendados = new ArrayList<>();
        alimentosRecomendados.add("Proteínas: Pollo, huevo, pescado, res, legumbres");
        alimentosRecomendados.add("Carbohidratos: Arroz, avena, papa, pasta, frutas");
        alimentosRecomendados.add("Grasas saludables: Aguacate, nueces, aceite de oliva");
        alimentosRecomendados.add("Verduras y hortalizas: Fuente de vitaminas y fibra");

        this.horariosComida = new ArrayList<>();
        horariosComida.add("Desayuno: 7:00 - 8:00 AM");
        horariosComida.add("Pre-entrenamiento: 1 - 2 horas antes");
        horariosComida.add("Post-entrenamiento: 30 - 60 minutos después");
        horariosComida.add("Almuerzo: 12:00 - 13:00 PM");
        horariosComida.add("Cena: 19:00 - 20:00 PM");

        this.macronutrientes = new ArrayList<>();
        macronutrientes.add("Proteínas: Construyen y reparan músculos");
        macronutrientes.add("Carbohidratos: Proporcionan energía");
        macronutrientes.add("Grasas: Regulan hormonas y salud general");
        macronutrientes.add("Fibra: Mejora la digestión");
    }


    public void mostrarAgua() {
        System.out.println("\n HIDRATACIÓN");
        System.out.println("--------------");
        System.out.println("Cantidad recomendada: " + litrosAguaDiarios + " litros al día");
    }

    public void mostrarAlimentos() {
        System.out.println("\n ALIMENTOS RECOMENDADOS");
        System.out.println("--------------------------");
        for (String alimento : alimentosRecomendados) {
            System.out.println("  → " + alimento);
        }
    }

    public void mostrarHorarios() {
        System.out.println("\n HORARIOS DE COMIDA");
        System.out.println("----------------------");
        for (String horario : horariosComida) {
            System.out.println("  → " + horario);
        }
    }

    public void mostrarMacronutrientes() {
        System.out.println("\n MACRONUTRIENTES");
        System.out.println("-------------------");
        for (String nutriente : macronutrientes) {
            System.out.println("  → " + nutriente);
        }
    }
}