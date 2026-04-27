import java.util.Scanner;

public class LeeNumeros1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = s.nextLine();

        System.out.println("Ingrese su edad: ");
        String edad = s.nextLine();

        System.out.println("Tu nombre es "+nombre+" y tu edad es "+edad);
}
}