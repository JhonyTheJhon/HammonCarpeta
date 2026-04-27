public class SentenciaIf01 {
    public static void main(String[] args) {
        System.out.println("¿Cual es la capita del Perú?");
        String respuesta = System.console().readLine();

        if (respuesta.equals("lima")) {
            System.out.println("¡La respuesta es correcta!");
        } else {
            System.out.println("¡Vuelve a repasar geografia!");
        }
    }
}