package Ejercicios4;

public class Ejercicio5 {
    public static void main(String[] args) {

        String rpt;
        int puntos = 0;

        System.out.println("CUESTIONARIO PROGRAMACIÓN 1");

        System.out.println("1. ¿Cúal de los siguientes tipos de dato de java es entero?");
        System.out.println("a) int \nb) double\nc) float");
        rpt = System.console().readLine();
        if (rpt.equals("a")) {
            puntos++;
        }

        System.out.println("2. ¿Cúal de los siguientes es la estructura condicional en java?");
        System.out.println("a) for \nb) if\nc) while");
        rpt = System.console().readLine();
        if (rpt.equals("b")) {
            puntos++;
        }

        System.out.println("3. ¿Cúal de estas Variables es de tipo int?");
        System.out.println("a) Perro \nb) 2\nc) Cascada");
        rpt = System.console().readLine();
        if (rpt.equals("b")) {
            puntos++;
        }

        System.out.println("4. ¿Cúal de los siguientes opciones es una Variable de tipo Double?");
        System.out.println("a) Gato \nb) 3\nc) 12.5555");
        rpt = System.console().readLine();
        if (rpt.equals("c")) {
            puntos++;
        }

        System.out.println("5. ¿Cúal de estas opciones sirve para mostrar texto?");
        System.out.println("a) System.out.println \nb) System.console().readLine()\nc) Text");
        rpt = System.console().readLine();
        if (rpt.equals("a")) {
            puntos++;
        }

        System.out.println("6. ¿Cúal de las siguientes opciones sirve para compraracion?");
        System.out.println("a) for \nb) if\nc) while");
        rpt = System.console().readLine();
        if (rpt.equals("b")) {
            puntos++;
        }

        System.out.println("7. ¿Cúal de los siguientes esta correctamente escrito?");
        System.out.println("a) System.out.println \nb) System.out.printIn\nc) Sistema.out.println");
        rpt = System.console().readLine();
        if (rpt.equals("a")) {
            puntos++;
        }

        System.out.println("8. ¿Cúal de los siguientes sirve para aumentar variables en un solo Print?");
        System.out.println("a) + \nb) *\nc) &");
        rpt = System.console().readLine();
        if (rpt.equals("a")) {
            puntos++;
        }

        System.out.println("9. ¿Cúal de los siguientes ?");
        System.out.println("a)  \nb) \nc) ");
        rpt = System.console().readLine();
        if (rpt.equals("b")) {
            puntos++;
        }

        System.out.println("10. ¿Cúal de los siguientes ?");
        System.out.println("a)  \nb) \nc) ");
        rpt = System.console().readLine();
        if (rpt.equals("b")) {
            puntos++;
        }

        System.out.println("Tu puntaje es "+ puntos );

    }
}
