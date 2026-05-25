public class EncuentraNúmero {
    public static void main(String[] args) {

        int NúmeroSecreto;
        int NúmeroIntroducido;
        int intentos = 0;

        System.out.println("Adivina el Número Secreto entre 0 y 100: ");

        NúmeroSecreto = (int) (Math.random()*101);

        do {
            NúmeroIntroducido = Integer.parseInt(System.console().readLine());

            if (NúmeroIntroducido == NúmeroSecreto) {
                System.out.println("Acertaste");
                intentos = 7;
            } else {
                if (NúmeroIntroducido > NúmeroSecreto) {
                    System.out.println("Intentalo de nuevo, tu número fue mayor al número secreto");
                    System.out.println("");
                } else {
                    System.out.println("Intentalo de nuevo, tu número fue menor al número secreto");
                    System.out.println("");
                }
                intentos++;
                System.out.println("Te quedan " + (5 - intentos) + " intentos: ");
            }
        } while (intentos < 5);
    }
}