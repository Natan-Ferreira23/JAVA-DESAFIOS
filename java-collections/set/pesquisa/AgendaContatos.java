package set.pesquisa;

import java.util.HashSet;
import  java.util.Set;
public class AgendaContatos {
    Set <Contato> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        agendaContatos.add(new Contato(nome,numero));
    }
    public void pesquisarContatos(String nome){
        System.out.println(agendaContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> pesquisa = new HashSet<>();
        for(Contato c : agendaContatos){
            if(c.getNome().startsWith(nome)){
                pesquisa.add(c);
            }
        }
        return pesquisa;
    }

    public Contato atualizarContato(String nome, int numero){
        Contato contatoAtualizado = null;

        for(Contato c : agendaContatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    public void exibirContatos(){
        System.out.println(agendaContatos);
    }
    public static void main(String[] args) {
        AgendaContatos listaContatos = new AgendaContatos();

        listaContatos.adicionarContato("camilla",123456);
        listaContatos.adicionarContato("camilla",0);
        listaContatos.adicionarContato("Camilla Cavalcante",121434);
        listaContatos.adicionarContato("Camilla Dio",4445561);
        listaContatos.adicionarContato("Natan",3232561);

        listaContatos.exibirContatos();
        System.out.println(listaContatos.pesquisarPorNome("Natan"));
        listaContatos.atualizarContato("Natan",5);
        System.out.println(listaContatos.pesquisarPorNome("Natan"));
    }
}
