package business;

import java.util.ArrayList;
import java.util.Scanner;

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
        this.exemplaresDisponiveis += exemplaresDisponiveis;
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


    public static void adicionaExemplares(ArrayList<Livro> livros, Scanner scanner)
    {
        int i = 0;
        int opcaoNum;
        Livro novoLivro = null; //Declara a variável novoAutor do tipo autor
        
        while(novoLivro == null)
        {
            for (Livro livroCadast : livros)     //Exibe a lista de livros existentes com um for-each
            {
                System.out.println(i+1 + "º: " + livroCadast.getTitulo()); //Exibe o nome do autor com o índice
                i++; 
            }
            System.out.println("Selecione um livro que irá receber mais exemplares:");
            opcaoNum = scanner.nextInt(); //Recebe input (do índice)
            
            if (opcaoNum >= 1 && opcaoNum <= livros.size())
                novoLivro = livros.get(opcaoNum - 1); //Retorna o livro selecionado com base no índice ("-1" pq na lista começa com 1, mas na verdade começa com 0)
            else
                System.out.println("Índice inválido! Tente novamente.");
        }
        System.out.println("Quantos exemplares deseja adicionar?");
        opcaoNum = scanner.nextInt();
        novoLivro.setExemplaresDisponiveis(opcaoNum);
    }
}
