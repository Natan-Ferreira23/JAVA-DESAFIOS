package projetoBancario;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1= new Cliente();
        Conta   contaNormal = new Conta();
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        //cadastrando cliente
        cliente1.setId(1);
        cliente1.setNome("Natan");
        //cadastrando conta corrente
        contaCorrente.setId(1);
        contaCorrente.setSaldo(0);
        contaCorrente.setCliente(cliente1);
        contaCorrente.setValorCreditoLimite(100);

        try{
            contaCorrente.parcelarCompra("CREDITO",1000,10);
            System.out.println("Compra parcelada com sucesso !");
        }catch (Excecao e){
            System.out.println(e.getMessage());
        }

        contaCorrente.aumentarLimiteCredito(100);
        System.out.println(contaCorrente.getValorCreditoLimite());
        try{
            contaCorrente.parcelarCompra("CREDITO",200,2);
            System.out.println("Compra parcelada com sucesso !");
        }catch (Excecao e){
            System.out.println(e.getMessage());
        }
        //cadastro conta poupança
        contaPoupanca.setSaldo(1000);
        contaPoupanca.setCliente(cliente1);
        contaPoupanca.setId(1);
        contaPoupanca.setJuros(2);
        contaPoupanca.renderJuros();//RENDENDO A POUPANÇA

        System.out.println("Após o rendimento na conta o saldo passou a ser de R$: " +contaPoupanca.getSaldo());

        try{
            contaPoupanca.transferir(1000,contaNormal);
            System.out.println("transferido com sucesso !! ");
        }catch (Excecao e){
            System.out.println(e.getMessage());
        }

        System.out.println(contaNormal.getSaldo());

    }
}
