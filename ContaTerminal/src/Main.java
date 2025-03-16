import Cliente.Cliente;
import ContaTerminal.ContaTerminal;
import java.util.Random;
import java.util.Scanner;

/**
 * @Desc: Essa é a função principal, onde vamos instanciar as classes contgaTerminal e Cliente e em seguida
 * mostrar na tela .
 * @author Natan Ferreira dos santos
 * @Since 13/02/2025
 */

public class Main {
    public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            ContaTerminal   conta   = new ContaTerminal();
            Cliente         cliente  = new Cliente();
            Random gerador = new Random();;
            conta.setCliente(cliente);

            /** GERANDO NUMEROS ALEATÓRIOS PARA ID*/
            conta.setIdentificador(gerador.nextInt(1000));
            cliente.setIdentificador(gerador.nextInt(1000));

            System.out.println("PROGRAMA: Por favor digite o numero da agencia");
            conta.setAgencia(leitura.nextLine());
            System.out.println("PROGRAMA: Digite o nome do cliente");
            cliente.setNome(leitura.nextLine());
            System.out.println("PROGRAMA: Digite o saldo: ");
            conta.setSaldo(leitura.nextDouble());

            System.out.println(("Olá "+cliente.getNome()+", obrigado por criar uma conta em nosso banco, sua agência é "+conta.getAgencia()+
                    ", " +
                    "conta "+conta.getIdentificador()+" e seu saldo "+conta.getSaldo()+" já está disponível para saque."));

    }

}