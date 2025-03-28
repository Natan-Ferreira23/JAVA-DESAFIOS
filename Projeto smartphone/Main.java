import com.apple.smartphone.Smartphone;
import video.Video;
import musica.Musica;
import navegador.Navegador;

public class Main {
    public static void main(String[] args) {
        Video video1 = new Video(1,"video 1");
        Musica musica1 = new Musica(2,"musica 1");
        Navegador navegador1 = new Navegador(1,"google");
        Smartphone smartphone = new Smartphone();

        smartphone.setId(1);
        smartphone.setModelo("IPhone 1");

        System.out.println("----------------------------------------");
        System.out.println("Esta é apresentação da Apple onde iremos mostrar o nosso novo modelo Iphone 1 !!!");
        System.out.println("----------------------------------------");

        smartphone.removerVideo(1);
        smartphone.acessarEmail();
        smartphone.acessarInternet();
        smartphone.acessarGoogleMas();
        smartphone.acessarMusica(1);
        smartphone.acessarNavegador(navegador1);
        smartphone.adicioanrMusica(musica1);
        smartphone.adicionarVideo(video1);
        smartphone.atenderChamada();
        smartphone.aumentarVolume();
        smartphone.desconectarInternet();
        smartphone.listarVideos();

    }
}