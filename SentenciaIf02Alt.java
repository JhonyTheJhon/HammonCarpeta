public class SentenciaIf02Alt {
    public static void main(String[] args) {
        System.out.println("Q");
        int numero = Integer.parseInt(System.console().readLine());

        if (numero > 0) {
            System.out.println("El número ingresado es POSITIVO");
        } else {
            if (numero == 0) {
                System.out.println("El número ingresado es CERO");
            } else {
                System.out.println("El número ingresado es NEGATIVO");
            };
        }
    }
}