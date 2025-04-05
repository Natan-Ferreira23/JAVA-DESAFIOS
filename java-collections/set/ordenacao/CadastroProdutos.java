package set.ordenacao;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> listaProdutos;

    public CadastroProdutos() {
        this.listaProdutos =new HashSet<>();
    }
    public void adicionarProduto(String nome,long codigo,double preco,int quantidade){
        listaProdutos.add(new Produto(nome,codigo,preco,quantidade));
    }
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(listaProdutos);

        return produtosPorNome;
    }
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(listaProdutos);
        return produtosPorPreco;
    }


    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto("Produto 2",1,15,5);
        cadastroProdutos.adicionarProduto("Produto 5",2,15,23);
        cadastroProdutos.adicionarProduto("Produto 5",3,15,51);
        cadastroProdutos.adicionarProduto("Produto 1",4,15,6);

        System.out.println(cadastroProdutos.listaProdutos);
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
