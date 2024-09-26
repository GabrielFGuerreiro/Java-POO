package business;

public class Biblioteca 
{
    private String nome, endereco, listaLivrosDisponiveis;

    public Biblioteca(String nome, String endereco, String listaLivrosDisponiveis)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.listaLivrosDisponiveis = listaLivrosDisponiveis;
    }

    public String getNome() {return nome;}
    public String getEndereco() {return endereco;}
    public String getListaLivrosDisponiveis() {return listaLivrosDisponiveis;}
}
