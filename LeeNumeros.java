public class LeeNumeros {
    public static void main(String[] args) {
        int primerNumero, segundoNumero;

        System.out.println("Ingresa el Primer número: ");
        primerNumero = Integer.parseInt(System.console().readLine());

        System.out.println("Ingresa el Segundo número: ");
        segundoNumero = Integer.parseInt(System.console().readLine());

        int Total;
        Total = primerNumero + segundoNumero;

        System.out.println("El resultado es: " + Total);
    }
}
