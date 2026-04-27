import java.util.Scanner;

public class SalarioPorHoras {
    public static void main(String[] args) {
        Scanner Crepe = new Scanner(System.in);
        System.out.println("¿Cuantas horas al dia trabaja el empleado?");
        double Horas = Crepe.nextDouble();
        double Dia = Horas*12;
        float Pago = (float)(Dia*7);
        System.out.println("A el Empleado se le pagara "+Pago+" soles a la semana");
    }
}