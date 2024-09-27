package business;

import java.util.ArrayList;

public class Livro
{
    private String titulo, genero;
    private int exemplaresDisponiveis;
    private Autor autor; //Associação
    
    public Livro(String titulo, Autor autor, String genero, int exemplaresDisponiveis)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    public String getTitulo() {return titulo;}
    public String getGenero() {return genero;}
    public Autor getAutor() {return autor;}
    public int getExemplaresDisponiveis() {return exemplaresDisponiveis;}

    public void setExemplaresDisponiveis(int exemplaresDisponiveis)
    {
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    public static void listaLivros(ArrayList<Livro> livros) 
    {//Método é static para não ter que criar um objeto (na classe principal) que iria apenas ser usado para acessar esse método.
        if(!livros.isEmpty())
        {   
            System.out.println("           \n[Lista de Livros]");
            for (Livro livro : livros)  //Exibe a lista de livros existentes com um for-each
            {
                System.out.println("\nTíttulo: " + livro.getTitulo() + "\nGênero: " + livro.getGenero() +
                "\nAutor: " + livro.getAutor().getNome() + "\nExemplares disponíveis:" + livro.getExemplaresDisponiveis()); 
            }
        }
        else
            System.out.println("Lista de livros vazia! Cadastre pelo menos um livro");
    }
}
