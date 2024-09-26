package business;

public class Autor
{
    private String nome, nacionalidade, dataDeNascimento;

    public Autor(String nome, String nacionalidade, String dataDeNascimento)
    {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataDeNascimento = dataDeNascimento;
    }
    public String getNome() {return nome;}
    public String getNacionalidade() {return nacionalidade;}
    public String getDataDeNascimento() {return dataDeNascimento;}
}