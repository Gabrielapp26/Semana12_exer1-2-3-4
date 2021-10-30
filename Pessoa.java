//nome da classe
public class Pessoa{
    //atributos
    private String nome;
    private String endereco;
    private String telefone;

    //metodo de alteração. Set de nome
    public void setNome(String nome){
        this.nome = nome;
    }
    //metodo de consulta. get de nome
    public String getNome(){
        return this.nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return this.telefone;
    }
    
    //construtor padrão
    public Pessoa(){

    }
    //construtor com um parâmetro
    public Pessoa(String nome){
        this.nome=nome;
    }
     //construtor com dois parâmetros
    public Pessoa(String nome, String endereco){
        this.nome=nome;
        this.endereco=endereco;
    }
}