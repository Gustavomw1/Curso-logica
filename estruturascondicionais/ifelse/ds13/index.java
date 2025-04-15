package estruturascondicionais.ifelse.ds13;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {

        char sexo = 'f';
        int idade = 19;

        if (sexo == 'm' && idade >= 18) {
            System.out.println("Alistamento obrigatorio");
        } else if (sexo == 'f' && idade > 18) {
            System.out.println("Caso deseje se alistar ");
        } else if (sexo == 'f' || sexo == 'm' && idade < 18) {
            System.out.println("Alistamento nao obrigatorio");
        } else {
            System.out.println("(ERROR)");
        }
    }
}