package map.pesquisa;
import java.util.HashMap;
import java.util.Map;
public class EstoqueProduto {
    private Map <Long, Produto> estoqueProdutos;

    public EstoqueProduto() {
        this.estoqueProdutos = new HashMap<>();
    }
    public void adicionarProduto(Long id, String nome,int quantidade, double preco){
        this.estoqueProdutos.put(id,new Produto(nome,quantidade,preco));
    }

    public void exibirProduto(){
        System.out.println(estoqueProdutos);
    }
    public double calcularValorTotalEstoque(){
        double valorTotal=0;
        if(!estoqueProdutos.isEmpty()){
            for(Produto p : estoqueProdutos.values()){
                valorTotal+=p.getPreco()*p.getQuantidade();
            }
        }
        return valorTotal;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = 0;
        System.out.println(maiorPreco);
        for(Produto p : estoqueProdutos.values()){
            if(p.getPreco()>maiorPreco){
                maiorPreco=p.getPreco();
                produtoMaisCaro=p;
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();
        estoque.adicionarProduto(1L,"Produto A",10,5);
        estoque.adicionarProduto(2L,"Produto B",5,10);
        estoque.adicionarProduto(3L,"Produto C",2,15);

        estoque.exibirProduto();
        System.out.println("O valor total do estoque é " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro "+estoque.obterProdutoMaisCaro());
    }
}
