package business;

import java.util.ArrayList;
import java.util.Scanner;
import business.Livro;
import business.Autor;

public class Cadastros
{
    ArrayList<Livro> livros = new ArrayList<>(); //Cria a lista de livros
    ArrayList<Autor> autores = new ArrayList<>(); //Cria a lista de autores
    
    public void cadastrarLivro(Scanner scanner)
    {
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine(); //Recebe input e atribui a variável título

        System.out.println("Digite o gênero do livro:");
        String genero = scanner.nextLine();

        //⌵⌵⌵⌵⌵AUTOR⌵⌵⌵⌵⌵\\
        System.out.println("Digite um autor da lista ou cadastre um novo!\n1 - Cadastrar um novo autor.\n2 - Utilizar um já existente.");
        int numero = scanner.nextInt();
        if(autores.isEmpty() && numero == 2)
        {
            System.out.println("\nLista vazia! Cadastre um autor.");
            numero = 1;
        }
        Autor novoAutor = null; //Declara a variável novoAutor
        if(numero == 1)
            novoAutor = cadastrarAutor(scanner); //Chama o método para cadastrar novo autor, enviando como parâmetro o scanner
        else if(numero == 2)
        {
            while(novoAutor == null)
            {
                //Exibe a lista de autores existentes com um for-each
                System.out.println("Selecione um autor existente:");
                int i = 0; //Inicializa um contador para o índice
                for (Autor autor : autores)
                {
                    System.out.println(i + ": " + autor.getNome()); //Exibe o nome do autor com o índice
                    i++; 
                }
            
                if (i >= 0 && i < autores.size())
                    novoAutor = autores.get(i); //Retorna o autor selecionado   
                else
                    System.out.println("Índice inválido! Tente novamente.");
            }
        }
        //^^^^^AUTOR^^^^^\\

        System.out.println("Digite o número de exemplares disponíveis:");
        int exemplaresDisponiveis = scanner.nextInt();

        //Cria um novo objeto Livro
        Livro novoLivro = new Livro(titulo, novoAutor, genero, exemplaresDisponiveis);
        livros.add(novoLivro); //Adiciona o (objeto) novo livro à lista livros
    }    

    public Autor cadastrarAutor(Scanner scanner)
    {
        System.out.println("Digite o nome do autor:");
        String nome = scanner.nextLine();
        
        System.out.println("Digite a nacionalidade do autor:");
        String nasciona = scanner.nextLine();

        System.out.println("Digite a data de nascimento do autor:");
        String dtNasci = scanner.nextLine();

        //Cria um novo objeto autor
        Autor novoAutor = new Autor(nome, nasciona, dtNasci);
        autores.add(novoAutor); // Adiciona o (objeto) novo autor à lista autores
        return novoAutor;
    }
}
