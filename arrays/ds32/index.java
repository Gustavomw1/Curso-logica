package arrays.ds32;

public class index {
    public static void main(String[] args) {
        int[][] arrayMultil = new int[2][2];
        arrayMultil[0][0] = 22;
        arrayMultil[0][1] = 11;
        arrayMultil[0][2] = 4;
        arrayMultil[1][0] = 44;
        arrayMultil[1][1] = 55;
        arrayMultil[1][2] = 9;
        arrayMultil[2][0] = 2;
        arrayMultil[2][1] = 5;
        arrayMultil[2][2] = 21;

        int resultadoMultiplicacaoDiagonalPrincipal = 0;
        for (int i = 0; i < arrayMultil.length; i++) {
            for (int j = 0; j < arrayMultil.length; j++) {
                if (i == j) {
                    resultadoMultiplicacaoDiagonalPrincipal = resultadoMultiplicacaoDiagonalPrincipal
                            * arrayMultil[i][j];
                }
            }
        }
    }
}
