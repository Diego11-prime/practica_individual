package Descanso;

import java.util.ArrayList;
import java.util.List;

public class Descanso {
    // Datos de recuperación
    private int horasSuenioRecomendadas;
    private List<String> tecnicasRecuperacion;
    private List<String> beneficiosDescanso;
    private List<String> diasDescanso;


    public Descanso() {
        this.horasSuenioRecomendadas = 8;

        this.tecnicasRecuperacion = new ArrayList<>();
        tecnicasRecuperacion.add("Estiramientos después de entrenar");
        tecnicasRecuperacion.add("Baños de agua tibia o fría");
        tecnicasRecuperacion.add("Masajes suaves en zonas cargadas");
        tecnicasRecuperacion.add("Meditación o respiración profunda");
        tecnicasRecuperacion.add("Caminatas lentas en días de descanso activo");

        this.beneficiosDescanso = new ArrayList<>();
        beneficiosDescanso.add("Reparación de tejidos musculares");
        beneficiosDescanso.add("Recarga de energía física y mental");
        beneficiosDescanso.add("Mejora el rendimiento en entrenamientos");
        beneficiosDescanso.add("Fortalece el sistema inmunológico");
        beneficiosDescanso.add("Ayuda a mantener el equilibrio emocional");

        this.diasDescanso = new ArrayList<>();
        diasDescanso.add("Domingo: Descanso completo");
        diasDescanso.add("1 día de descanso activo a la semana");
        diasDescanso.add("Descansar entre entrenamientos de misma zona muscular");
    }

    public void mostrarSuenio() {
        System.out.println("\n😴 SUEÑO Y DESCANSO");
        System.out.println("--------------------");
        System.out.println("Horas recomendadas: " + horasSuenioRecomendadas + " horas diarias");
        System.out.println("Es el periodo donde el cuerpo se recupera y crece");
    }

    public void mostrarTecnicas() {
        System.out.println("\n🧘 TÉCNICAS DE RECUPERACIÓN");
        System.out.println("----------------------------");
        for (String tecnica : tecnicasRecuperacion) {
            System.out.println("  → " + tecnica);
        }
    }

    public void mostrarBeneficios() {
        System.out.println("\n✅ BENEFICIOS DEL DESCANSO");
        System.out.println("---------------------------");
        for (String beneficio : beneficiosDescanso) {
            System.out.println("  → " + beneficio);
        }
    }

    public void mostrarDias() {
        System.out.println("\n📅 DÍAS DE DESCANSO");
        System.out.println("--------------------");
        for (String dia : diasDescanso) {
            System.out.println("  → " + dia);
        }
    }
}