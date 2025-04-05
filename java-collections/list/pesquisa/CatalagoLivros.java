package list.pesquisa;
import list.ordenacao.Livro;

import java.util.ArrayList;
import java.util.List;
public class CatalagoLivros {
    private List <Livro> catalagoLivros;

    public CatalagoLivros() {
        this.catalagoLivros = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        catalagoLivros.add(new Livro(titulo,autor,anoPublicacao));
    }
    public List <Livro> pesquisarAutor(String autor){
        List <Livro> livrosAutor = new ArrayList<>();
        if(!catalagoLivros.isEmpty()){
            for(Livro l : catalagoLivros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosAutor.add(l);
                }
            }
        }
        return livrosAutor;
    }
    public List<Livro> pesquisarPorIntervalosAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos =new ArrayList<>();
        if(!catalagoLivros.isEmpty()){
            for(Livro l : catalagoLivros){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if(!this.catalagoLivros.isEmpty()){
            for(Livro l : catalagoLivros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
            CatalagoLivros catalagoLivros1 = new CatalagoLivros();

            catalagoLivros1.adicionarLivro("Titulo 1", "Autor 1", 2020);
            catalagoLivros1.adicionarLivro("Titulo 2", "Autor 2", 1998);
            catalagoLivros1.adicionarLivro("Titulo 3", "Autor 3", 1952);
            catalagoLivros1.adicionarLivro("Titulo 3", "Autor 3", 1944);
            catalagoLivros1.adicionarLivro("Titulo 5", "Autor 5", 2023);

            System.out.println(catalagoLivros1.pesquisarAutor("Autor 3"));
            System.out.println(catalagoLivros1.pesquisarPorIntervalosAnos(2020,2025));
            System.out.println(catalagoLivros1.pesquisarPorTitulo("Titulo 3"));

    }
}
