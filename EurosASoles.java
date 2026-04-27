import java.util.Scanner;

public class EurosASoles {
    public static void main(String[] args) {
        Scanner Crepe = new Scanner(System.in);
        System.out.println("Escriba cuantos euros quiere convertir a soles: ");
        int Euros = Crepe.nextInt();
        float Conversion = (float)(Euros*4.04);
        System.out.println(Euros+" Euros son "+Conversion+" soles");
    }
}