public class Busquedade24 {
    public static void main(String[] args) {

        int Buscandoa24;
        int conteo = 0;

        System.out.println();

        do {
            Buscandoa24 = (int) (Math.random()*101);
            if (Buscandoa24 % 2 == 0) {
                System.out.println(Buscandoa24);
                conteo++;
            } else {
                
            }
        } while (Buscandoa24 != 24);

        if (Buscandoa24 == 24) {
            System.out.println("Se han generado " + conteo + " números");
        } else {
            
        }
    }
}