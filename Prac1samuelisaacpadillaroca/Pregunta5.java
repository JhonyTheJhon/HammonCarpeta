package Prac1samuelisaacpadillaroca;

import java.util.Scanner;

public class Pregunta5 {
    
	public static void main(String[] args) {
	    Scanner Crepe = new Scanner(System.in);
	    
		System.out.println("Ingrese el primer número: ");
        int Num1 = Crepe.nextInt();
		
		System.out.println("Ingrese el segundo número: ");
        int Num2 = Crepe.nextInt();
        
        if (Num1 == Num2) {
            System.out.println("Estos números son iguales");
        } else {
            if (Num1 > Num2) {
                System.out.println("Numeros organizados de mayor a menor: " + Num1 + Num2);
            } else {
                System.out.println("Numeros organizados de mayor a menor: " + Num2 + Num1);
            }
        }
	}
}
