package Controle;

public class ParametrosInvalidosException extends Throwable {
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
