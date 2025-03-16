package Cliente;
/**
 * Classe para o cliente que tera uma ligação com a classe banco
 * @author Natan Ferreira dos santos
 * @since 14/03/2025
 */
public class Cliente {

    private int identificador;
    private String nome;

    public Cliente(){

    }
    public  Cliente(int identificador,String nome){
        this.identificador=identificador;
        this.nome=nome;
    }

    public void setIdentificador(int identificador){
        this.identificador=identificador;
    }
    public int getIdentificador(){
        return this.identificador;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return this.nome;
    }

}
