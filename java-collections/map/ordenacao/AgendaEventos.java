package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map <LocalDate,Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data,String nome, String atracao){
        eventos.put(data,new Evento(nome,atracao));
    }
    public void exibirEventos(){
        Map <LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventos);
        System.out.println(eventosTreeMap);
    }
    public void proximoEvento(){
        LocalDate dataAual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento =null;
        Map <LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventos);
        for(Map.Entry<LocalDate,Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAual) || entry.getKey().isAfter(dataAual)){
                proximaData= entry.getKey();
                proximoEvento= entry.getValue();
                System.out.println("O proximo evento: "+ entry.getValue() + " acontecera na data "+ entry.getValue());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos eventos1 = new AgendaEventos();

        eventos1.adicionarEvento(LocalDate.of(2022, Month.JULY,15),"Evento 1", "Atracao 1");
        eventos1.adicionarEvento(LocalDate.of(2022, 7,9),"Evento 2", "Atracao 2");
        eventos1.adicionarEvento(LocalDate.of(2000, Month.JANUARY,10),"Evento 3", "Atracao 3");
        eventos1.adicionarEvento(LocalDate.of(2025, Month.APRIL,10),"Evento 4", "Atracao 4");
        eventos1.exibirEventos();
        eventos1.proximoEvento();
    }

}
