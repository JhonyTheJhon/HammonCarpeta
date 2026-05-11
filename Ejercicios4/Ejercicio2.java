package Ejercicios4;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        System.out.println("Programa que resuelve ecuacion del tipo: ax + b = 0");

        System.out.println("Introduce el valor de a: ");
        Double a = Double.parseDouble(System.console().readLine());
        
        System.out.println("Introduce el valor de b: ");
        Double b = Double.parseDouble(System.console().readLine());

        if (a != 0) {
            System.out.println("x = " + (-b/a));
        } else {
            System.out.println("Esta ecuación no tiene solución");
        }
    }
}