package arrays.ds28;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner Scanner = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1));
            notas[i] = Scanner.nextDouble();
        }
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        media = media / notas.length;
        System.out.println("A média das notas é: " + media);
    }
}
