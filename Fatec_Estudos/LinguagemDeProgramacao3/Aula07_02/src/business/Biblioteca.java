package business;

import java.util.ArrayList;

public class Biblioteca 
{
    private String nome, endereco;
    private ArrayList<String> listaLivrosDisponiveis;

    public Biblioteca(String nome, String endereco)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.listaLivrosDisponiveis = new ArrayList<>(); //Inicializa a lista no construtor
    }

    public String getNome() {return nome;}
    public String getEndereco() {return endereco;}
    public ArrayList<String> getListaLivrosDisponiveis() {return listaLivrosDisponiveis;}

    public void criarListaLivrosDisponiveis(ArrayList<Livro> livros)
    {
        for (Livro livroCadas : livros)
        {
            listaLivrosDisponiveis.add(livroCadas.getTitulo());
        }
    }
}
