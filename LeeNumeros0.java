public class LeeNumeros0 {
    public static void main(String[] args) {
        int primerNumero, segundoNumero;
        double promedio;
        String linea;

        System.out.println("Ingresa el Primer número: ");
        linea = System.console().readLine();
        primerNumero = Integer.parseInt(linea);

        System.out.println("Ingresa el Segundo número: ");
        linea = System.console().readLine();
        segundoNumero = Integer.parseInt(linea);

        int Total;
        Total = primerNumero + segundoNumero;

        System.out.println("El resultado es: " + Total);
    }
}