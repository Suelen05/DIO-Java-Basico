import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(java.util.Locale.US);

        System.out.println("Informe o número da sua conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe a agência da sua conta: ");
        String agencia = scanner.nextLine();

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();
        //String nome = "MARIO ANDRADE";
        System.out.println("Informe seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");;
        
        scanner.close();

    }
}
