package lendoArquivos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LendoArquivo {
    public static void main(String[] args) {
        String csvFile = "C:\\TEMP\\Produtos.csv";
        String nextLine;
        String linha;
        Produto produto;
        List <Produto> listaProdutos = new ArrayList<>();
        try {
            BufferedReader br =  new BufferedReader(new FileReader(csvFile));
            br.readLine();
            while((linha = br.readLine())!=null){
                String [] conteudos = linha.split(";");
                produto = new Produto(conteudos[0], Double.parseDouble(conteudos[1]),  Integer.parseInt(conteudos[2]));
                listaProdutos.add(produto);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        listaProdutos.forEach(System.out::println);
        System.out.println("O resultado da média é: "+ String.format("%.2f",Calculo.calculaMedia(listaProdutos)));

    }
}
