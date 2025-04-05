package list.OperacoesBasicas;

public class Tarefas {
    private String descricao;

    public Tarefas() {
    }

    public Tarefas(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefas{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
