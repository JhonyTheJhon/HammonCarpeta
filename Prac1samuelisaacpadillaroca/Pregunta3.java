package Prac1samuelisaacpadillaroca;

import java.util.Scanner;

public class Pregunta3 {
    
	public static void main(String[] args) {
	    Scanner Crepe = new Scanner(System.in);
	    
		System.out.println("Ingrese el primer número: ");
        int Num1 = Crepe.nextInt();
		
		System.out.println("Ingrese el segundo número: ");
        int Num2 = Crepe.nextInt();
        
        System.out.println("Ingrese el tercer número: ");
        int Num3 = Crepe.nextInt();
        
        if (Num1 == 1 && Num2 == 2 && Num3 == 3) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
	}
}
