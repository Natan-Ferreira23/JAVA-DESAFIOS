package com.apple.reprodutorMusical;
import musica.Musica;

public interface ReprodutorMusical {
    public void tocarMusica(int id);
    public void pausarMusica(int id);
    public void trocarMusica();
    public void aumentarVolume();
    public void diminuirVolume();
    public void adicioanrMusica(Musica musica);
    public void removerMusica(int id);
    public void listarMusica();
    public void acessarMusica(int id);
}
