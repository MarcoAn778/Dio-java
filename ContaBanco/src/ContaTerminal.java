import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

    int numero;
    String agencia;
    String nomeCliente;
    float saldo;

    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor, digite o número da Agência ! ");
    numero = sc.nextInt();

    System.out.println("Por favor, digite o nome da Agência ! ");
    agencia = sc.next();

    System.out.println("Por favor, digite o seu nome ! ");
    nomeCliente = sc.nextLine();
    nomeCliente+=sc.nextLine();
    
    System.out.println("Por favor, digite o seu saldo ! ");
    saldo = sc.nextFloat();

    System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +" e seu saldo " + saldo + " já está disponível para saque.");
}
    
}
