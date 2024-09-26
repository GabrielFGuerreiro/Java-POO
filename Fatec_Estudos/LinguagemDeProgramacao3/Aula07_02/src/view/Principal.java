package view;

import java.util.ArrayList;
import java.util.Scanner;

import business.Autor;
import business.Cadastros;
import business.Livro;

public class Principal
{
    public static void main(String[] args)
    {       
        Scanner scanner = new Scanner(System.in); //Cria o scanner para receber input do user
        Cadastros cadastrar = new Cadastros(); //Instância do cadastro

        while(true)
        {
            System.out.println("Menu\n1.Cadastrar livros");
            int numero = scanner.nextInt(); scanner.nextLine(); //Pega o enter

            switch (numero)
            {
                case 1:
                    //Cria uma variável do tipo livro e atribui o retorno (o objeto) do método a ela
                    cadastrar.cadastrarLivro(scanner); //Chama o método de cadastro, enviando como parâmetros o scanner e o autor
                    System.out.println("Livro cadastrado com sucesso!");
  
                    break;
            
                case 2:
                    scanner.close(); // Fecha o Scanner
                    return; // Encerra o programa

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }//switch
        }//while
    }//main

}//classe
