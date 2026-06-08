public class CuadradoCubo {
	public static void main(String[] args) {
	    
	    int[] numero = new int[20];
	    int[] cuadrado = new int[20];
	    int[] cubo = new int[20];
	    
		System.out.println("Programa que muestra el cuadrado y el cubo de 20 números aleatorios de 0 a 100 en 3 columnas:");
		
		for (int i = 0; i < numero.length; i++) {
		    numero[i] = (int) (Math.random() * 101);
        }
        
        for (int i = 0; i < cuadrado.length; i++) {
		    cuadrado[i] = (int) (Math.pow(numero[i],2));
        }
        
        for (int i = 0; i < cubo.length; i++) {
		    cubo[i] = (int) (Math.pow(numero[i],3));
        }
        
        for (int i = 0; i < numero.length; i++) {
		    System.out.println(numero[i] + " " + cuadrado[i] + " " + cubo[i]);
        }
	}
}
