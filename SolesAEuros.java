import java.util.Scanner;

public class SolesAEuros {
    public static void main(String[] args) {
        Scanner Crepe = new Scanner(System.in);
        System.out.println("Escriba cuantos Soles quiere convertir a Euros: ");
        int Soles = Crepe.nextInt();
        float Conversion = (float)(Soles*0.25);
        System.out.println(Soles+" Soles son "+Conversion+" Euros");
    }
}