import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: IMPORTAR CLASSE SCANNER

        //EXIBIR MSG PARA USUÁRIO

        //OBTER PELO SCANNER OS VALORES DIGITADOS NO TERMINAL

        //EXIBIR MENSAGEM DA CONTA

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu Nome!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        double saldo = 237.48;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                            agencia + ", conta " + numero + "e seu saldo " + saldo + " já está disponível para saque");
    }
}