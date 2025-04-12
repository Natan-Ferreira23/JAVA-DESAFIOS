package lendoArquivos;
import java.util.List;

public  class Calculo {
 public static double calculaMedia(List <Produto> lista){
    double somaPreco  = 0;
    int somaQuantiade = 0;
    double media      = 0;
    for(Produto produto: lista){
        somaPreco     += produto.getPreco() * produto.getQuantidade();
        somaQuantiade += produto.getQuantidade();
    }
    System.out.println("Total de quantidade: " + somaQuantiade);
    System.out.println("Total de preco:      " + somaPreco    );
    media =  somaPreco / somaQuantiade;
    return media;
 }
}
