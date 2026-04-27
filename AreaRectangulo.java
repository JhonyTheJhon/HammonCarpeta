import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner Crepe = new Scanner(System.in);
        System.out.println("Escriba la base del rectangulo: ");
        double Base = Crepe.nextDouble();
        System.out.println("Escriba la altura del rectangulo: ");
        double Altura = Crepe.nextDouble();
        double Area = Base*Altura;
        System.out.println("El Área del Rectangulo es "+Area+"cm²");
    }
}