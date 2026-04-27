import java.util.Scanner;

public class SalarioPorHoras3 {
    public static void main(String[] args) {
        Scanner Crepe = new Scanner(System.in);
        System.out.println("¿Cuantas horas al dia trabaja el empleado?");
        double Horas = Crepe.nextDouble();
        System.out.println("¿Cuantos dias a la semana trabaja?");
        int Dias = Crepe.nextInt();
        double Dia = Horas*12;
        float Pago = (float)(Dia*Dias);
        System.out.println("A el Empleado se le pagara "+Pago+" soles a la semana");
    }
}