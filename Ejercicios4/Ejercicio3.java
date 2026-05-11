package Ejercicios4;

public class Ejercicio3 {
    public static void main(String[] args) {

        System.out.println("Programa que calcual el promedio de tres notas");

        System.out.println("Introduce la primera nota: ");
        Double nota1 = Double.parseDouble(System.console().readLine());

        System.out.println("Introduce la segunda nota: ");
        Double nota2 = Double.parseDouble(System.console().readLine());

        System.out.println("Introduce la tercera nota: ");
        Double nota3 = Double.parseDouble(System.console().readLine());

        Double promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio < 11) {
            System.out.println("Promedio: "+ promedio);
            System.out.println("Insuficiente");
        }

        if (promedio >= 11 && promedio < 13) {
            System.out.println("Promedio: "+ promedio);
            System.out.println("Suficiente");
        }

        if (promedio >= 13 && promedio < 16) {
            System.out.println("Promedio: "+ promedio);
            System.out.println("Bien");
        }

        if (promedio >= 16 && promedio < 21) {
            System.out.println("Promedio: "+ promedio);
            System.out.println("Notable");
        }

    }
}