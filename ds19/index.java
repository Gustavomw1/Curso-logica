package ds19;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("1. calcular imposto");
            System.out.println("2. Depositar salario");
            System.out.println("3. Sair");
            System.out.println("Digite a sua opcao");
            opcao = teclado.nextInt();
        }
        System.out.println("Programa encerrado");
    }
}
