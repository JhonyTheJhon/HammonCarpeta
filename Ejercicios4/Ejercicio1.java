package Ejercicios4;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        System.out.print("Ingresa las horas trabajadas: ");
        String line = System.console().readLine();
        double HorasTrabajadas = Double.parseDouble(line);

        double Salario = 0;

        if (HorasTrabajadas <= 40) {
            Salario = HorasTrabajadas * 12;
            System.out.println("El pago semanal es: " + Salario);
        } else {

            double HorasExtras = HorasTrabajadas - 40;
            Salario = (HorasTrabajadas * 12) + (HorasExtras * 4);
            System.out.println("El pago semanal es: " + Salario);
        }
    }
}