import java.util.Scanner;

public class Operacion2Num {
    public static void main(String[] args) {
        Scanner Crepe = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int Num1 = Crepe.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int Num2 = Crepe.nextInt();
        int Suma = Num1+Num2;
        int Resta = Num1-Num2;
        int Multiplicacion = Num1*Num2;
        double Division = Num1/Num2;
        System.out.println("La suma de estos dos números es "+Suma+", la resta es "+Resta+", la multiplicación es "+Multiplicacion+" y la división es "+Division);
    }
}