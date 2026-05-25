public class DadosGemelos {
    public static void main(String[] args) {

        int dado1;
        int dado2;

        System.out.println("Dos dados continuarán rodando hasta que encuentren a su gemelo: ");

        do {
           dado1 = (int) (Math.random()*6 + 1);
           dado2 = (int) (Math.random()*6 + 1);

           System.out.println("Dado 1: " + dado1);
           System.out.println("Dado 2: " + dado2);
           System.out.println("");
        } while (dado1 != dado2);
    }
}