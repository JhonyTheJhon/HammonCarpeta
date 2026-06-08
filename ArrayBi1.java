public class ArrayBi1 {
    public static void main(String[] args) {

        int[][] XY = new int[3][2];

        XY[0][0] = 20;
        XY[1][0] = 67;
        XY[1][1] = 33;
        XY[2][1] = 7;

        int fila, columna;

        for (fila = 0 ; fila < 3 ; fila++) {
            System.out.print("Fila: " + fila);
            for (columna = 0 ; columna < 2 ; columna++) {
                System.out.printf("%10d", XY[fila][columna]);
            }
            System.out.println();
        }
    }
}