package projetoBancario;

public class ContaPoupanca extends Conta{
    private double juros;

    public ContaPoupanca() {

    }

    public ContaPoupanca(int id, Cliente cliente, double saldo, double juros) {
        super(id, cliente, saldo);
        this.juros = juros;
    }

    public void renderJuros(){
        if(this.getSaldo()>=0){
            this.setSaldo(this.getSaldo() + ( this.getSaldo()*(juros/100)) );
        }else{
            throw  new Excecao("O saldo é zero ou inferir, logo não a conta não rende juros ");
        }
    }

    public void transferir(double valor, Conta conta){
        if(this.getSaldo()<valor) throw  new Excecao("O valor a ser transferido deve ser maior ou igual ao saldo !!! ");
        if(valor<=1000){
            conta.depositar(valor);
        }else{
            throw new Excecao("Com a conta poupança as tranferencias são limitadas por valor !");
        }
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
}
