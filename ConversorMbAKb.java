import java.util.Scanner;

public class ConversorMbAKb {
    public static void main(String[] args) {
        Scanner Crepe = new Scanner(System.in);
        System.out.println("¿Cuantos Mb quieres convertir a Kb?");
        double Mb = Crepe.nextDouble();
        double Kb = Mb*1000;
        System.out.println(Mb+" Mb son "+Kb+" Kb");
    }
}