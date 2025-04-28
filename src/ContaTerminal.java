import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Por favor, digite o número da conta: ");
            Integer numeroConta = scan.nextInt();
            System.out.println("Por favor, digite o número da agência: ");
            String agencia = scan.next();
            System.out.println("Por favor, digite o nome do cliente: ");
            String nomeCliente = scan.next();
            System.out.println("Por favor, digite o saldo: ");
            Double saldo = scan.nextDouble();

            ContaBanco conta = new ContaBanco(saldo, nomeCliente, agencia, numeroConta);
            System.out.println(conta);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, verifique os dados inseridos.");
        } catch (Exception e) {
            System.out.println("Erro ao processar os dados. Por favor, tente novamente.");
        } finally {
            scan.close();
        }
    }
}
