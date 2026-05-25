public class Aleatorio100a199 {
    public static void main(String[] args) {
        
        System.out.println("Programa que muestra 50 números aleatorios de 100 a 199: ");

        for (int i = 1 ; i < 51 ; i++) {
            System.out.println((int) (Math.random()*100 + 100));
            System.out.println("");
        }
    }
}