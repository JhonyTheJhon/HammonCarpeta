import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner Crepe = new Scanner(System.in);
        System.out.println("Escriba la base del triangulo: ");
        double Base = Crepe.nextDouble();
        System.out.println("Escriba la altura del triangulo: ");
        double Altura = Crepe.nextDouble();
        double Area = (Base*Altura)/2;
        System.out.println("El Área del Triangulo es "+Area+"cm²");
    }
}