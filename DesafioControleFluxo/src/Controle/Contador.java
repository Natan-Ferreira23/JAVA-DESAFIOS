package Controle;
import  java.util.Scanner;
public class Contador {
    public static void main (String [] args){
        int num1;
        int num2;
        Scanner leitura = new Scanner(System.in);

        try{
            System.out.print("Por favor digite um numero: ");
            num1= leitura.nextInt();
            System.out.print("Digite o segundo numero: ");
            num2=leitura.nextInt();
            contar(num1,num2);
        }catch(ParametrosInvalidosException exception){
            System.out.print("O segundo parametro deve ser maior que  o segundo");
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm>parametroDois){
            throw  new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for(int i=1;i<=contagem;i++){
            System.out.println("Contagem: ["+i+"]");
        }
    }
}
