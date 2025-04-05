package list.listaCompras;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ListaDeCompras {
    List <Produto> listaDeCompras;

    public ListaDeCompras() {
        this.listaDeCompras = new ArrayList<>();
    }
    public void adicionarProduto(String nome,double preco,int quantidade){
        listaDeCompras.add(new Produto(nome, preco, quantidade));
    }
    public void removerProduto(String nome) {
        if(!listaDeCompras.isEmpty()){
            for(Produto produto : listaDeCompras){
                if(produto.getNome().equalsIgnoreCase(nome)){
                    listaDeCompras.remove(produto);
                    System.out.println("O produto "+ nome +" foi removido com sucesso");
                    break;
                }
            }
        }else{ //lista vazia
           throw new Excecao("ERRO ao remover produto, lista VAZIA");
        }
    }
    public void listarProdutos(){
        if(!listaDeCompras.isEmpty()){
        System.out.println("**TODOS OS PRODUTOS**");
        for(Produto produto : listaDeCompras){
            System.out.println(produto.getNome());
        }
        System.out.println("*********************");
        }
    }
    public void listaDetalhada(){
        System.out.println(listaDeCompras);
    }
    public double valorTotalLista(){
        double valorTotal=0;
            for(Produto  produto: listaDeCompras){
                valorTotal +=produto.getPreco() * produto.getQuantidade();
            }
            return valorTotal;
    }
    public int quantidadeTotalProdutos(){
        int quantidadeTotal=0;
        for(Produto produto : listaDeCompras){
            quantidadeTotal+=produto.getQuantidade();
        }
        return quantidadeTotal;
    }

    public void pesquisarProdutoPeloNome(String nome){
            boolean achou = false;
            if(!listaDeCompras.isEmpty()){
                for(Produto produto : listaDeCompras){
                    if(produto.getNome().equalsIgnoreCase(nome)){
                        System.out.println(produto.toString());
                        achou = true;
                    }
                }
                if(achou==false) throw  new Excecao("O produto não consta na lista !");
            }else{
                throw new Excecao("ERRO ao remover produto, lista VAZIA");
            }
    }
    public void listaOrdemAlfabetica(){
        List <Produto> listaSort = new ArrayList<>(this.listaDeCompras);
        listaSort.sort(Comparator.comparing(Produto::getNome));
        for(Produto produto : listaSort){
            System.out.println(produto);
        }
    }
}
