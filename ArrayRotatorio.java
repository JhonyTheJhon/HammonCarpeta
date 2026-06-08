public class ArrayRotatorio {
	public static void main(String[] args) {
	    
	    int[] NumRodador = new int[15];
	    
		System.out.println("Escriba 15 datos Numericos: ");
		
		for (int i = 1 ; i < NumRodador.length; i++) {
		    NumRodador[i] = Integer.parseInt(System.console().readLine());;
        }
        
        NumRodador[0] = Integer.parseInt(System.console().readLine());
        
        for (int Li = 0; Li < NumRodador.length; Li++) {
		    System.out.println("Número[" + Li + "] = " + NumRodador[Li]);
        }
	}
}
