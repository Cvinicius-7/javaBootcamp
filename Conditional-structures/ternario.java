
public class ternario {
    public static void main(String[] args) {
        double saldo = 1000.0;
        double valorSaque = 500.0;

        saldo = saldo >= valorSaque ? saldo - valorSaque : saldo;
        System.out.println("Saldo atual: " + saldo);
    }
}
