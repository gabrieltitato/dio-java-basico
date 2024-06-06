import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da agência:");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Por favor, digite seu nome completo:");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Por favor, digite o valor do primeiro depósito:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque." );
       
    }
}

