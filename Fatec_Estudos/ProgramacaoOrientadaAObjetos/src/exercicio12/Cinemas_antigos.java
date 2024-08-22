package exercicio12;

public class Cinemas_antigos extends Cinemas_Santos
{
    private String nome;

    Cinemas_antigos(String antigo)
    {
        System.out.println("História dos cinemas de Santos\n" + antigo);        
    }
    public void setNome(String nome) {this.nome = nome;}
    public String getNome() {return nome;}
}