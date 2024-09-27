package view;

import java.util.ArrayList;
import java.util.Scanner;

import business.Livro;
import business.Autor;
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
            System.out.println("       Menu\n1.Cadastrar livro\n2.Cadastrar autor\n3.Lista livros\n4.Lista autores\n0.Sair");
            int numero = scanner.nextInt(); scanner.nextLine(); //Pega o enter

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
                
                case 4:
                    //Autor objAutor = new Autor(null, null, null);  <--- outra possibilidade era criar uma instância, enviando parâmetros nulos.
                    //       ^--- Não muito recomendada, pois criaria um objeto apenas para acessar um método.
                    Autor.listaAutores(autores);  //Um método static pode ser chamado diretamente pelo nome da classe, sem precisar criar um objeto.
             
                    break;

                case 0:
                    scanner.close(); //Fecha o Scanner
                    return; //Encerra o programa (sai do while infinito)

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }//switch
        }//while
    }//main
}//classe
