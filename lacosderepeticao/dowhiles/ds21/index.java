package lacosderepeticao.dowhiles.ds21;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner Scanner = new Scanner(System.in);
        do {
            System.out.println("PLAYER 1: digite um número de 1 a 10");
            int num1 = Scanner.nextInt();
            System.out.println("PLAYER 2: digite um número de 1 a 10");
            int num2 = Scanner.nextInt();
            System.out.println("ACERTOU " + (num1 == num2));
            System.out.println("-------------------");
            System.out.println("Deseja continuar jogando?");
            System.out.println("1.Sim");
            System.out.println("2.Não");
            desejaContinuar = Scanner.nextInt();
        } while (desejaContinuar == 1);
    }
}
