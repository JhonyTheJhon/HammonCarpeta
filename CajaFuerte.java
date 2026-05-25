public class CajaFuerte {
	public static void main(String[] args) {
		
		int intentos = 0;
		
		while (intentos != 4) {
		    
		    System.out.println("Escriba la combinación: ");
		    int combinacion = Integer.parseInt(System.console().readLine());
		    
		    if (combinacion == 1234) {
		        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
		        intentos = 4;
		    }else{
		        System.out.println("Lo siento, esa no es la combinación");
		        intentos = intentos + 1;
		    }
		}
		
	}
}
