package lacosderepeticao.fors.ds26;

public class index {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Fazendo a tabuada do " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + " = " + (i * j));
            }
        }
    }
}
