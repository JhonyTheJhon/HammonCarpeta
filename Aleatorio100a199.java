public class Aleatorio100a199 {
    public static void main(String[] args) {
        
        int Maximo = 100;
	    int Minimo = 199;
	    int Sumador = 0;
	    
		System.out.println("Programa que muestra 50 números aleatorios de 100 a 199: ");

        for (int i = 1 ; i < 51 ; i++) {
            int Numero = (int) (Math.random()*100 + 100);
            
            System.out.print(Numero + " ");
            
            Sumador = Sumador + Numero;
            
            if (Numero > Maximo) {
                Maximo = Numero;
            }

            if (Numero < Minimo) {
                Minimo = Numero;
            }
        }
        
        System.out.println("\nEl Número Máximo es: " + Maximo);
        System.out.println("El Número Mínimo es: " + Minimo);
        System.out.println("El Promedio de estos Números es: " + (Sumador / 50));
    }
}
