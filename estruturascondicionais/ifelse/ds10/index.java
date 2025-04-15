package estruturascondicionais.ifelse.ds10;

public class index {
    public static void main(String[] args) {
        String nome = "Gustavo";
        int idade = 20;

        if (idade < 10) {
            System.out.println(nome + " Participará da categoria infantil.");
        } else if (idade >= 10 && idade <= 15) {
            System.out.println(nome + " Participará da categoria juvenil.");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " Participará da categoria pré-adulto.");
        } else {
            System.out.println(nome + " Participará da categoria adulto.");
        }
    }
}
