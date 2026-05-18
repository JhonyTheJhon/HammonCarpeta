package Prac1samuelisaacpadillaroca;

import java.util.Scanner;

public class Pregunta4 {
    
	public static void main(String[] args) {
	    Scanner Crepe = new Scanner(System.in);
	    
		System.out.println("Ingrese el primer número: ");
        int Num1 = Crepe.nextInt();
		
		System.out.println("Ingrese el segundo número: ");
        int Num2 = Crepe.nextInt();
        
        System.out.println("Ingrese el tercer número: ");
        int Num3 = Crepe.nextInt();
        
        int orden1;
        int orden2;
        int orden3;
        
        if (Num1 > Num2 && Num1 > Num3) {
            orden1 = Num1;
            if (Num2 > Num3) {
                orden2 = Num2;
                orden3 = Num3;
                System.out.println("Numeros organizados de mayor a menor: " + orden1 + orden2 + orden3);
            } else {
                orden2 = Num3;
                orden3 = Num2;
                System.out.println("Numeros organizados de mayor a menor: " + orden1 + orden2 + orden3);
            }
        } else {
            if (Num2 > Num1 && Num2 > Num3) {
                orden1 = Num2;
                if (Num1 > Num3) {
                    orden2 = Num1;
                    orden3 = Num3;
                    System.out.println("Numeros organizados de mayor a menor: " + orden1 + orden2 + orden3);
                } else {
                    orden2 = Num3;
                    orden3 = Num1;
                    System.out.println("Numeros organizados de mayor a menor: " + orden1 + orden2 + orden3);
                }
            } else {
                if (Num3 > Num1 && Num3 > Num2) {
                    orden1 = Num3;
                    if (Num1 > Num2) {
                        orden2 = Num1;
                        orden3 = Num2;
                        System.out.println("Numeros organizados de mayor a menor: " + orden1 + orden2 + orden3);
                    } else {
                        orden2 = Num2;
                        orden3 = Num1;
                        System.out.println("Numeros organizados de mayor a menor: " + orden1 + orden2 + orden3);
                    }
                }
            }
        }
	}
}
