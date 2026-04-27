public class SentenciaIf03Alt {
    public static void main(String[] args) {
        double nota1, nota2, nota3;
        double promedio;

        System.out.println("Q");
        nota1 = Integer.parseInt(System.console().readLine());

        System.out.println("Q");
        nota2 = Integer.parseInt(System.console().readLine());

        System.out.println("Q");
        nota3 = Integer.parseInt(System.console().readLine());

        promedio = (nota1+nota2+nota3)/3;

        if (promedio >= 10.5) {
            System.out.println("Felicidades has aprobado!!");
        } else {
            System.out.println("Lo siento, pal otro año será!!!");
        }
    }
}