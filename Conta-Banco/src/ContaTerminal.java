import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    int numeroConta;
    String agencia;
    String nomeCliente;
    double saldo;

    Scanner sc = new Scanner(System.in);

    System.out.println("SEJA BEM-VINDO(A)! \n\nPor favor, digita seu nome: ");
    nomeCliente = sc.next();
    System.out.println("Por favor, digite o número da Agência: ");
    agencia = sc.next();
    System.out.println("Por favor, digite o número da Conta: ");
    numeroConta = sc.nextInt();
    System.out.println("Por favor, digite seu saldo: ");
    saldo = sc.nextDouble();

    System.out.println("Olá " + nomeCliente + ", sua conta foi criada com sucesso em nosso banco. Sua agência é " + agencia + ", sua conta é " + numeroConta + ". Seu saldo de " + saldo + " já está disponível para saque. Tenha uma ótima experiência!!");


    sc.close();
    }
}
