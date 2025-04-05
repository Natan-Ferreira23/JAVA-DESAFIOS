package list.OperacoesBasicas;

import java.util.*;
import java.util.ArrayList;

public class ListaTarefas {
   private List <Tarefas> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
            this.listaTarefas.add(new Tarefas(descricao));
    }
    public void removerTarefa(String descricao){
        //criando lista vazia
        List <Tarefas> tarefasParaRemov = new ArrayList<>();
        //adicionando tarefas para remover na lista
        for(Tarefas t: listaTarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemov.add(t);
            }
        }
        //removendo todas as tarefas que forem iguais ao que foi passada pelo parametro
        listaTarefas.removeAll(tarefasParaRemov);
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaTarefas);
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        System.out.println("O numero total de tarefas na lista é: "+ lista.obterNumeroTotalTarefas());
        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 2");
        lista.adicionarTarefa("Tarefa 3");
        System.out.println("O numero total de tarefas na lista é: "+ lista.obterNumeroTotalTarefas());
        lista.removerTarefa("Tarefa 2");
        System.out.println("O numero total de tarefas na lista é: "+ lista.obterNumeroTotalTarefas());

        lista.obterDescricoesTarefas();
    }
}




