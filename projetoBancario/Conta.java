package projetoBancario;

public class Conta {
    private int id;
    private Cliente cliente;
    private double saldo;
    public Conta() {
    }

    public Conta(int id, Cliente cliente, double saldo) {
        this.id = id;
        this.cliente = cliente;
        this.saldo=saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo+=valor;
    }
    public void sacar(double valor){
        this.saldo -=valor;
    }
    public void tranferir(double valor, Conta conta){
        conta.depositar(valor);
    }

}
