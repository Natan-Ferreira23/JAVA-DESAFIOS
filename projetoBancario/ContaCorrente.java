package projetoBancario;

public class ContaCorrente extends Conta{
    private double valorCreditoLimite;

    public ContaCorrente() {

    }

    public ContaCorrente(int id, Cliente cliente, double saldo, double valorCreditoLimite) {
        super(id, cliente, saldo);
        this.valorCreditoLimite = valorCreditoLimite;
    }

    public double getValorCreditoLimite() {
        return valorCreditoLimite;
    }

    public void setValorCreditoLimite(double valorCreditoLimite) {
        this.valorCreditoLimite = valorCreditoLimite;
    }
    public void aumentarLimiteCredito(double aumento){
        this.valorCreditoLimite+=aumento;
    }
    public void parcelarCompra(String cartao,double valor, int qtdParcelas )  {
        double valorAPagar;
        if(cartao.equalsIgnoreCase("credito") || cartao.equalsIgnoreCase("crédito")){
            if(valor<=this.getValorCreditoLimite()){
                valorAPagar = valor / qtdParcelas;
                System.out.println("É possível comprar no crédito e parcelar em "+qtdParcelas+" o valor a pagar por mês será "+ valorAPagar);
            }else{
                throw new Excecao("Compra rejeitada, é necessário aumentar o limite !! ");
            }
        }else{
            throw new Excecao("O cartão inserido esta incorreto, por favor inserir um cartão de crédito válido !!");
        }
    }
}
