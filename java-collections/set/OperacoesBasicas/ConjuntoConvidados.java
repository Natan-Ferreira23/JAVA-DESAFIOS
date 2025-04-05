package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;
public class ConjuntoConvidados {
    private Set<Convidado> listaConvidado;

    public ConjuntoConvidados() {
        this.listaConvidado = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite){
        listaConvidado.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidado(int codigoConvite){
        Convidado convidadoParaRemover =null;
        for(Convidado c: listaConvidado){
            if(c.getCodigoConvite()==codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        listaConvidado.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return this.listaConvidado.size();
    }
    public void exibirConvidados(){
        System.out.println(listaConvidado);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem a quantidade de " + conjuntoConvidados.contarConvidados()+" convidados dentro da lista SET");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);
        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removerConvidado(1235);
        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem a quantidade de " + conjuntoConvidados.contarConvidados()+" convidados dentro da lista SET");
    }
}
