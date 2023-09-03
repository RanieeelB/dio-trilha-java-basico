import java.util.Scanner;



public class ContaTerminal {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo(a) ao Raniel's Bank!");
        System.out.println("Siga os próximos passos para criar sua conta!");
        System.out.println(" ");

        System.out.print("Qual o seu nome? ");
        String nome = Scanner.next();

        System.out.print("Qual o número da sua conta? ");
        String numero = Scanner.next();

        System.out.print("Qual o agência da sua conta (com dígito)? ");
        String agencia = Scanner.next();
        System.out.println(" ");

        double saldo = 550.20;
        double saldosaque = 420;


        System.out.println(" ");
        System.out.println("Olá "+nome +", Sua conta foi criada com sucesso!");
        System.out.println("Sua conta: "+numero);
        System.out.println("Sua agência: "+agencia);
        System.out.println("Seu saldo: "+saldo);
        System.out.println("Saldo disponível para saque: "+saldosaque);
        System.out.println(" ");





    }
}