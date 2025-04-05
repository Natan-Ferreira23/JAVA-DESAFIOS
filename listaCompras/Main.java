package list.listaCompras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ListaDeCompras lista = new ListaDeCompras();
        boolean resposta=true;
        Scanner leitura = new Scanner(System.in);
        String nome;
        double preco;
        int quantidade;
        int opcao=-1;

        System.out.println("<-------------------- LISTA DE COMPRAS -------------------->");

        while(resposta==true){
            System.out.println("_____________{ESCOLHA UMA OPÇÃO }");
            System.out.println(" 1- Adicione um produto             ;");
            System.out.println(" 2- Remova um produto               ;");
            System.out.println(" 3- Valor total da lista            ;");
            System.out.println(" 4- Pesquisar produto da lista      ;");
            System.out.println(" 5- Quantidade total de produtos    ;");
            System.out.println(" 6- Mostrar todos os itens da lista ;");
            System.out.println(" 0- Finalizar compra                ;");
            System.out.print("Digite uma opção: ");
            opcao = leitura.nextInt();
            leitura.nextLine();
            switch (opcao){
                case 1:
                    try{
                        System.out.print("Digite o nome do produto: ");
                        nome = leitura.nextLine();
                        System.out.print("Digite o preço do produto R$: ");
                        preco=leitura.nextDouble();
                        System.out.print("Digite a quantidade do produto: ");
                        quantidade=leitura.nextInt();
                    } catch (InputMismatchException e) {
                        throw new RuntimeException("ERRO DE TIPO DOS VALORES " +e.getMessage());
                    }
                        lista.adicionarProduto(nome,preco,quantidade);
                        System.out.println("Produto adicionado a lista com sucesso !!!");
                    break;
                case 2:
                    System.out.print("Digite o nome do produto para remover da lista: ");
                    nome=leitura.nextLine();
                    try{
                        lista.removerProduto(nome);
                    }catch (Excecao e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("O valor total da lista de compras em R$: "+ lista.valorTotalLista());
                    break;
                case 4:
                    System.out.print("Digite o nome do produto a ser pesquisado: ");
                    nome = leitura.nextLine();
                    try{
                        lista.pesquisarProdutoPeloNome(nome);
                    }catch (Excecao e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("A quantidade total de itens na lista de compras é: " + lista.quantidadeTotalProdutos());
                    break;
                case 6:
                    lista.listaOrdemAlfabetica();
                    break;
                case 0:
                    resposta=false;
                    System.out.println("O usuário finalizou o programa");
                    break;
                default:
                    System.out.println("Opção incorreta");
                    break;
            }
        }

        System.out.println("<-------------------- FIM DAS  COMPRAS -------------------->");

    }
}
