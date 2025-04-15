package lacosderepeticao.whiles.ds20;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        String login = "superi";
        String password = "kar98";
        Scanner Scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite seu login");
            String loginDigitado = Scanner.nextLine();
            System.out.println("Digite seu password");
            String passwordDigitado = Scanner.nextLine();

            if (login.equals(loginDigitado) && password.equals(passwordDigitado)) {
                System.out.println("ACESSO CONCEDIDO");
                break;
            }
            System.out.println("ACESSO NEGADO");
        }
        System.out.println("PROGRAMA TERMINADO");
    }
}
