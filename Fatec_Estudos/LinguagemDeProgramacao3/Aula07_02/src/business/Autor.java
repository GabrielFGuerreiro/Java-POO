package business;

import java.util.ArrayList;

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

    public static void  listaAutores(ArrayList<Autor> autores) 
    {//Método é static para não ter que criar um objeto (na classe principal) que iria apenas ser usado para acessar esse método.
        if(!autores.isEmpty())
        {   
            System.out.println("           \n[Lista de Autores]");
            for (Autor autor : autores)  //Exibe a lista de autores existentes com um for-each
            {
                System.out.println("\nNome: " + autor.getNome() + "\nNascionalidade: " + autor.getNacionalidade() +
                "\nData de nascimento: " + autor.getDataDeNascimento()); 
            }
        }
        else
            System.out.println("Lista de autores vazia! Cadastre pelo menos um autor");
    }
}