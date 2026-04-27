public class SentenciaIf02 {
    public static void main(String[] args) {
        System.out.println("Q");
        int numero = Integer.parseInt(System.console().readLine());

        if (numero > 0) {
            System.out.println("El número ingresado es POSITIVO");
        } else {
            System.out.println("El número ingresado es NEGATIVO");
        }
    }
}