package arrays.ds29;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner Scanner = new Scanner(System.in);
        String resultadoMultiplicacArray = "";
        for (int i = 0; i < array1.length; i++) {
            System.out.println("vetor 1, posicao " + i + ": ");
            array1[i] = Scanner.nextInt();
            System.out.println("vetor 2, posicao " + i + ": ");
            array2[i] = Scanner.nextInt();
            array3[i] = array1[i] * array2[i];
            resultadoMultiplicacArray = resultadoMultiplicacArray + array3[i] + " ";
        }

        System.out.println(resultadoMultiplicacArray);
    }
}
