import java.util.ArrayList;
import java.util.List;
public class ListaNomes {
    private List<String> nomes = new ArrayList();

    public ListaNomes() {
        List<String> nomes =new ArrayList<>();
    }

    public ListaNomes(List<String> nomes) {
        this.nomes = nomes;
    }
    public void adicionarNome(String nome){
        this.nomes.add(nome);
    }
    public void removerNome(String nome){
        this.nomes.remove(nome);
    }
    public void listarNomes(){
        for(String nome : this.nomes){
            System.out.println(nome);
        }
    }

}