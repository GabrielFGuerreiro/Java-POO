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

    public void setExemplaresDisponiveis(int quantidadeDesejada, int opcao )
    {
        if(opcao == 1) //Adicionar
        {    
            this.exemplaresDisponiveis += quantidadeDesejada;
            System.out.println("Exemplares adicionados com sucesso!");
        }

        else if(opcao == 2 && exemplaresDisponiveis < quantidadeDesejada) //Pegar mais do que tem (erro)
        {
            System.out.println("Quantidade indisponível para empréstimo.");
            return;
        }

        else //Pegar
        {
            this.exemplaresDisponiveis -= quantidadeDesejada;
            System.out.println("Empréstimo realizado com sucesso!");
        }
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


    public static void modificarExemplares(ArrayList<Livro> livros, Scanner scanner)
    {
        int i = 0;
        int escolha;
        Livro novoLivro = null; //Declara a variável novoAutor do tipo livro
        
        if(livros.isEmpty())//Verificação se a lista esta vazia
        {
            System.out.println("Lista vazia! Cadestre pelo menos um livro.");
            return;
        } 
        
        do //Decidir se irá adicionar ou retirar exemplares
        {
            System.out.println("Deseja adicionar mais exemplares ou realizar um empréstimo?\n1.Adicioanar\n2.Empréstimo");
            escolha = scanner.nextInt();
            
            if(escolha != 1 && escolha != 2) 
                System.out.println("Opção inválida.");

        }while(escolha != 1 && escolha != 2);

        for (Livro livroCadast : livros)     //Exibe a lista de livros existentes com um for-each
        {
            System.out.println(i+1 + "º: " + livroCadast.getTitulo()); //Exibe o nome do autor com o índice
            i++; 
        }
        System.out.println("Selecione o livro correspondente:");
        
        while(novoLivro == null) //Só irá parar até que o novoLivro receba o livro desejado (de acordo com o índice)
        {
            int indice = scanner.nextInt(); //Recebe input (do índice do livro) 
            
            if (indice >= 1 && indice <= livros.size()) //Verificarção do final: verificar se o indice esta correto
            {
                novoLivro = livros.get(indice - 1); //Retorna/atribui o livro selecionado com base no índice ("-1" pq na lista começa com 1, mas na verdade começa com 0)
                System.out.println("Diga a quantidade de exemplares.");
                novoLivro.setExemplaresDisponiveis(scanner.nextInt(), escolha);
            }
            else
                System.out.println("Índice inválido! Tente novamente.");
        }//while
    }//Método modificar exemplares
}//Classe livro
