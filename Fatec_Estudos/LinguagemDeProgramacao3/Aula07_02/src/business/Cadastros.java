package business;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastros
{
    public void cadastrarLivro(Scanner scanner, ArrayList<Livro> livros, ArrayList<Autor> autores)
    {
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine(); //Recebe input e atribui a variável título

        System.out.println("Digite o gênero do livro:");
        String genero = scanner.nextLine();

        //⌵⌵⌵⌵⌵AUTOR⌵⌵⌵⌵⌵\\
        System.out.println("Digite um autor da lista ou cadastre um novo!\n1 - Cadastrar um novo autor.\n2 - Utilizar um já existente.");
        int opcaoNum = scanner.nextInt();  //Recebe input
        scanner.nextLine(); // Consumir a quebra de linha

        if(autores.isEmpty() && opcaoNum == 2) //Caso não haja nenhum autor cadastrado
        {
            System.out.println("\nLista vazia! Cadastre um autor.");
            opcaoNum = 1;
        }

        Autor novoAutor = null; //Declara a variável novoAutor do tipo autor
        if(opcaoNum == 1)
            novoAutor = cadastrarAutor(scanner, autores); //Chama o método de cadastro, enviando como parâmetro o scanner e a lista de autores
        else if(opcaoNum == 2)
        {
            while(novoAutor == null)
            {
                int i = 1; //Inicializa um contador para o índice
                for (Autor autor : autores)     //Exibe a lista de autores existentes com um for-each
                {
                    System.out.println(i + "º: " + autor.getNome()); //Exibe o nome do autor com o índice
                    i++; 
                }
                System.out.println("Selecione um autor existente:");
                opcaoNum = scanner.nextInt(); //Recebe input (do índice)
            
                if (opcaoNum >= 1 && opcaoNum < autores.size())
                    novoAutor = autores.get(opcaoNum); //Retorna o autor selecionado com base no índice
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



    public Autor cadastrarAutor(Scanner scanner, ArrayList<Autor> autores)
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
