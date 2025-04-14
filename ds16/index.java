package ds16;

public class index {
    public static void main(String[] args) {
        String conta = "CONTA POUPANÇA";
        switch (conta) {
            case "CONTA POUPANÇA":
                System.out.println("0.05%");
                break;
            case "CONTA CORRENTE":
                System.out.println("0.02%");
                break;
            case "CONTA INVESTIMENTO":
                System.out.println("0.1%");
            default:
                System.out.println("CONTA INEXISTENTE");
                break;
        }
    }
}
