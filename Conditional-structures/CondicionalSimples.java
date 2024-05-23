package ConditionalStructures;
public class CondicionalSimples {
    public static void main(String[] args) {
        double saldo = 1000.0;
        double valorSaque = 500.0;

        if(saldo >= valorSaque){
            saldo = saldo - valorSaque;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
        System.out.println("Saldo atual: " + saldo);

    }
    
}
