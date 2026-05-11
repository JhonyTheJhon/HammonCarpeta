package Prac1samuelisaacpadillaroca;

public class Pregunta2 {
    public static void main(String[] args) {
        System.out.println("Ingrese su edad por favor: ");
        int edad = Integer.parseInt(System.console().readLine());

        if (edad < 18) {
            System.out.println("¿Sabes hacia dónde dirigir tu futuro? Seguro puedo ayudarte.");
        } else {
            if (edad >= 18 && edad < 30) {
                System.out.println("Es un momento excelente para impulsar tu carrera.");
            } else {
                System.out.println("Nunca es tarde para aprender ¿Qué curso tomaremos?");
            }
        }
    }
}
