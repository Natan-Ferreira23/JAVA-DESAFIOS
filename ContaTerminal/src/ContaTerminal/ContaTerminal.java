package ContaTerminal;
import Cliente.Cliente;

/**
 * Classe conta que sera preenchida pelo usuário no arquivo Main
 * @author Natan Ferreira dos Santos
 * @Since 14/03/2025
 */
public class ContaTerminal {
    private int     identificador;
    private String  agencia;
    private Cliente cliente;
    private double  saldo;

    public  ContaTerminal(){

    }
    public  ContaTerminal(int identificador, String agencia, Cliente cliente, double saldo){
        this.identificador=identificador;
        this.agencia=agencia;
        this.cliente=cliente;
        this.saldo=saldo;
    }
    public void setIdentificador(int identificador){
        this.identificador=identificador;
    }
    public int getIdentificador(){
        return this.identificador;
    }
    public void setAgencia(String agencia){
        this.agencia=agencia;
    }
    public String getAgencia(){
        return this.agencia;
    }
    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }
}
