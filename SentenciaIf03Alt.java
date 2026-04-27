import java.util.Scanner;

public class SentenciaIf03Alt {
    public static void main(String[] args) {
        Scanner Crepe = new Scanner(System.in);
        double nota1, nota2, nota3;
        double promedio;

        System.out.println("Q");
        nota1 = Crepe.nextDouble();

        System.out.println("Q");
        nota2 = Crepe.nextDouble();

        System.out.println("Q");
        nota3 = Crepe.nextDouble();

        promedio = ((double)nota1+(double)nota2+(double)nota3)/3;

        if (promedio >= 10.5) {
            System.out.printf("%8.2f",promedio);
            System.out.println(" Felicidades has aprobado!!");
        } else {
            System.out.printf("%8.2f",promedio);
            System.out.println(" Lo siento, pal otro año será!!!");
        }
    }
}