package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class OrdenacaoPessoa {
    private List <Pessoa> pessoaLista;

    public OrdenacaoPessoa() {
        this.pessoaLista = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaLista.add(new Pessoa(nome,idade,altura));
    }
    public List <Pessoa> OrdenarPorIdade(){
        List <Pessoa> pessoasIdade = new ArrayList<>(pessoaLista);
        Collections.sort(pessoasIdade);
        return pessoasIdade;
    }
    public List <Pessoa> OrdenarPorAltura(){
        List<Pessoa> pessoaAltura = new ArrayList<>(pessoaLista);
        Collections.sort(pessoaAltura,new ComparablePorAltura());
        return pessoaAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa lista = new OrdenacaoPessoa();

        lista.adicionarPessoa("Nome 1",20, 1.56);
        lista.adicionarPessoa("Nome 2",30, 1.80);
        lista.adicionarPessoa("Nome 3",25, 1.70);
        lista.adicionarPessoa("Nome 4",17, 1.56);

        System.out.println(lista.OrdenarPorAltura());
        System.out.println(lista.OrdenarPorIdade());
    }
}
