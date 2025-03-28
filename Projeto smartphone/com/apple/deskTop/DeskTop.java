package com.apple.deskTop;
import navegador.Navegador;
public interface DeskTop {
    public void acessarInternet();
    public void desconectarInternet();
    public void acessarNavegador(Navegador navegador);
    public void acessarEmail();
    public void acessarGoogleMas();
}
