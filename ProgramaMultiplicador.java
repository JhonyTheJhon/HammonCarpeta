import java.util.Scanner;

public class ProgramaMultiplicador {
    public static void main(String[] args) {
        Scanner Crepe = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int Num1 = Crepe.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int Num2 = Crepe.nextInt();
        int Multiplicacion = Num1*Num2;
        System.out.println("La Multiplicación de estos dos números es: "+Multiplicacion);
    }
}