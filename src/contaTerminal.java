import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, seja muito bem-vindo ao nosso sistema de criação de conta bancária!");
        System.out.println("Gostaria de acessar sua conta? " + "[Y/N]");

        String resposta;
        do {
            resposta = entrada.next();

            if (resposta.equalsIgnoreCase("Y")) {
                System.out.println("Por favor, digite sua Agência: ");
                String agencia = entrada.next();
                System.out.println("Por favor, digite o número da Conta: ");
                int conta = entrada.nextInt();
                System.out.println("Por favor, digite seu nome: ");
                String nome = entrada.next();
                System.out.println("Por favor, digite seu saldo: ");
                double saldo = entrada.nextDouble();
                System.out.println("Olá " + nome + "! Obrigado por acessar sua conta em nosso banco, sua agência é "
                        + agencia + ", conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque.");

                break;
            } else if (resposta.equalsIgnoreCase("N")) {
                System.out.println("Uma pena! Até a próxima.");
                break;
            } else {
                System.out.println("Obção inválida! Digite [Y/N]");
            }
        } while (true);
        entrada.close();
    }
}