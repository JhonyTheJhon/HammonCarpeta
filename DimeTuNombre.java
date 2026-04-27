public class DimeTuNombre {
    public static void main(String[] args) {
        String nombre;// Declaramos variable tipo cadena de caracteres
        System.out.println("Por favor, dime tu nombre completo y los ultimos tres digitos de tu tarjeta de credito: ");
        nombre = System.console().readLine(); //leemos lo que escribe e usuario
        System.out.println("Hola " + nombre +  ", bienvenido a java!!!");
    }
}