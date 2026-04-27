import java.util.Scanner;

public class SalarioPorHoras2 {
    public static void main(String[] args) {
        Scanner Crepe = new Scanner(System.in);
        System.out.println("¿Cuantas horas trabaja el empleado a la semana?");
        double Horas = Crepe.nextDouble();
        float Pago = (float)(Horas*12);
        System.out.println("A el empleado se le pagara "+Pago+" soles a la semana");
    }
}
