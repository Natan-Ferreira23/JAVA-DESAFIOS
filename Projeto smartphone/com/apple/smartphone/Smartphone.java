package com.apple.smartphone;

import com.apple.aparelhoTelefonico.AparelhoTelefonico;
import com.apple.deskTop.DeskTop;
import com.apple.reprodutorMusical.ReprodutorMusical;
import com.apple.reprodutorVideo.ReprodutorVideo;
import musica.Musica;
import navegador.Navegador;
import video.Video;

public class Smartphone implements AparelhoTelefonico, DeskTop, ReprodutorMusical, ReprodutorVideo {
    private int id;
    private String modelo;

    public Smartphone(){

    }
    public Smartphone(String modelo, int id){
        this.modelo=modelo;
        this.id=id;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    @Override
    public void telefonar(String numero) {
        System.out.print("Telefone liga para o número: "+ numero);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada !");
    }

    @Override
    public void recusarChamada() {
        System.out.println("Rescusando chamada ! ");
    }

    @Override
    public void acessarInternet() {
        System.out.println("Acessando internet/wifi");
    }

    @Override
    public void desconectarInternet() {
        System.out.println("Desconectando da internet");
    }

    @Override
    public void acessarNavegador(Navegador navegador) {
        System.out.println("Acessando o navegador " + navegador.getNome());
    }

    @Override
    public void acessarEmail() {
        System.out.println("Acessando o email ");
    }

    @Override
    public void acessarGoogleMas() {
        System.out.println("Acessando o google Maps");
    }

    @Override
    public void tocarMusica(int id) {
        String musica;
        if(id==1){
            musica = "musica 1";
        }else{
            musica = "musica 2";
        }
        System.out.println("Tocando a musica: "+musica);
    }

    @Override
    public void pausarMusica(int id) {
        String musica;
        if(id==1){
            musica = "musica 1";
        }else{
            musica = "musica 2";
        }
        System.out.println("Pausando a musica: "+musica);
    }

    @Override
    public void trocarMusica() {
        System.out.println("Trocando para outra música");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando volume");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuir volume");
    }

    @Override
    public void adicioanrMusica(Musica musica) {
        System.out.println("Adicionando musica: "+ musica.getNome());
    }

    @Override
    public void removerMusica(int id) {
        String musica;
        if(id==1){
            musica = "musica 1";
        }else{
            musica = "musica 2";
        }
        System.out.println("Removendo a musica: "+musica);
    }

    @Override
    public void listarMusica() {
        String lista [] = {"musica 1","Musica 2", "Musica 3"};
        System.out.println("Listando musicas");
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }

    @Override
    public void acessarMusica(int id) {
        String musica;
        if(id==1){
            musica = "musica 1";
        }else{
            musica = "musica 2";
        }
        System.out.println("Acessando a musica: "+musica);
    }

    @Override
    public void verVideo(int id) {
        String video;
        if(id==1){
            video = "video 1";
        }else{
            video="video 2";
        }
        System.out.println("Visualizando o video "+ video);
    }

    @Override
    public void pausarVideo(int id) {
        String video;
        if(id==1){
            video = "video 1";
        }else{
            video="video 2";
        }
        System.out.println("Pausando o video "+ video);
    }

    @Override
    public void adicionarVideo(Video video) {
        System.out.println("Adicionando o video "+ video.getNome());
    }

    @Override
    public void removerVideo(int id) {
        String video;
        if(id==1){
            video = "video 1";
        }else{
            video="video 2";
        }
        System.out.println("Removendo o video "+ video);
    }

    @Override
    public void listarVideos() {
        String lista [] ={"video 1","video 2","video 3"};
        System.out.println("Listando videos");
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }
}
