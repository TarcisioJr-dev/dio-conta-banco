// importação da biblioteca Scanner para captura das entradas do usuário.
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número da agência mais próxima (9999): ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número da conta (xxx-x): ");
        String numeroConta = scanner.next();

        System.out.print("Informe o nome Completo do Cliente: \n");
    //o primeiro scanner.nextLine() para limpar o buffer do scanner para a captura correta e completa do nome do usuário
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();

        System.out.print("Informe o saldo em reais: \nR$ ");
    //para evitar possíveis erros por conta de inserção de virgula(,) coloquei o .replace para melhor adaptação do código;
        String saldoInput = scanner.next().replace(",", ".");
        float saldo = Float.parseFloat(saldoInput);
        
    //utilizei um printf para que pudesse colocar uma formatação simples para o valor do saldo para que caso o usuário digite mais do que 2 decimais ele ficar restrito.
        System.out.printf("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco\nsua agência é "+ agencia + ", conta "+ numeroConta +" e seu saldo de R$ %.2f ja está disponível para saque.",saldo);
        System.out.println("\n");
    }
}
