import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da Conta: ");
        int numeroCliente = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insira o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Saldo da Conta:");
        double saldo = scanner.nextDouble();

        String mensagem = "OlA " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroCliente + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);
        scanner.close();
    }
}
