package view;

import java.util.ArrayList;
import java.util.Scanner;

import business.Livro;
import business.Autor;
import business.Biblioteca;
import business.Cadastros;

public class Principal
{
    public static void main(String[] args)
    {       
        ArrayList<Livro> livros = new ArrayList<>(); //Cria a lista de livros
        ArrayList<Autor> autores = new ArrayList<>(); //Cria a lista de autores
        Cadastros cadastrar = new Cadastros(); //Instância do cadastro
        Scanner scanner = new Scanner(System.in); //Cria o scanner para receber input do user

        while(true)
        {
            System.out.println(
            "\n" +"     [MENU]\n1.Cadastrar livro\n2.Cadastrar autor\n3.Lista livros\n4.Lista autores\n5.Infos biblioteca"+
            "\n6.Adiciona exemplares\n0.Sair");
            System.out.println("Digite uma opção:");
            int numero = scanner.nextInt();
            scanner.nextLine(); //Pega o enter

            switch(numero)
            {
                case 1:
                    cadastrar.cadastrarLivro(scanner, livros, autores); //Chama o método de cadastro, enviando como parâmetros o scanner, e as listas de livros e de autores
                    System.out.println("Livro cadastrado com sucesso!\n");
  
                    break;
            
                case 2:
                    cadastrar.cadastrarAutor(scanner, autores); //Chama o método de cadastro, enviando como parâmetros o scanner e a lista de autores
                    System.out.println("Autor cadastrado com sucesso!\n");

                    break;

                case 3:
                    Livro.listaLivros(livros);
                    
                    break;

                case 4:
                    //Autor objAutor = new Autor(null, null, null);  <--- outra possibilidade era criar uma instância, enviando parâmetros nulos.
                    //       ^--- Não muito recomendada, pois criaria um objeto apenas para acessar um método.
                    Autor.listaAutores(autores);  //Um método static pode ser chamado diretamente pelo nome da classe, sem precisar criar um objeto.
             
                    break;
                
                case 5:
                    Biblioteca biblio = new Biblioteca("Library", "Rua da Saudade, 123");
                    System.out.println("Nome: " + biblio.getNome() + "\nEndereço: " + biblio.getEndereco() +
                    "\nLivros disponíveis: " + biblio.getListaLivrosDisponiveis(livros));

                    break;

                case 6:


                    break;

                case 0:
                    System.out.println("Encerrando...");
                    scanner.close(); //Fecha o Scanner
                    return; //Encerra o programa (sai do while infinito)

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }//switch
        }//while
    }//main
}//classe
