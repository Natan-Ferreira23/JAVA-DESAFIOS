package map.operacoesBasicas;
import java.util.HashMap;
import java.util.Map;
public class AgendaContato {
    private Map <String, Integer> agendaContato;

    public AgendaContato() {
        this.agendaContato = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
        agendaContato.put(nome,telefone);
    }
    public void removerContato(String nome){
        if(!agendaContato.isEmpty()){
            agendaContato.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContato);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome=null;
        if(!agendaContato.isEmpty()){
           numeroPorNome= agendaContato.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContato listaContatos = new AgendaContato();
        listaContatos.adicionarContato("camilla",123456);
        listaContatos.adicionarContato("camilla",0);
        listaContatos.adicionarContato("Camilla Cavalcante",121434);
        listaContatos.adicionarContato("Camilla Dio",4445561);
        listaContatos.adicionarContato("Natan",3232561);

        listaContatos.exibirContatos();
        System.out.println(listaContatos.pesquisarPorNome("Natan"));


    }
}
