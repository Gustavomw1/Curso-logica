package estruturascondicionais.ifelse.ds12;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu usuario: ");
        String usuario = teclado.next();

        if (usuario.equals("") || usuario.equalsIgnoreCase("admin") || usuario.equalsIgnoreCase("adiministrador")) {
            System.out.println("(ERROR) Esse usuario não pode ser utilizado");
        } else {
            System.out.println("Usuario cadastrado com sucesso");
        }
    }
}
