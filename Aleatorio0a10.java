public class Aleatorio0a10 {
    public static void main(String[] args) {
        
        System.out.println("20 números aleatorios de 0 a 10: ");

        for (int i = 1 ; i < 21 ; i++) {
            System.out.print((int) (Math.random()*11) + " ");
        }
    }
}
