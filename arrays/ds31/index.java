package arrays.ds31;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        int[][] arrayMultil = new int[2][3];
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        for (int i = 0; i < arrayMultil.length; i++) {
            for (int j = 0; j < arrayMultil[i].length; j++) {
                System.out.println("Digite o valor da posição [" + i + "][" + j + "]: ");
                arrayMultil[i][j] = scanner.nextInt();
            }
        }

        // Exibição dos dados
        for (int i = 0; i < arrayMultil.length; i++) {
            for (int j = 0; j < arrayMultil[i].length; j++) {
                System.out.println("[" + i + "][" + j + "] = " + arrayMultil[i][j]);
            }
        }

        scanner.close();
    }
}
