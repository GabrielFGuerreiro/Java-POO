import java.util.Scanner;

public class ListaSupermercado
{
   // String listaSupermercado[] = {"", "", ""};
    String[] listaSupermercado = new String[5];


    public void adicionaItem(Scanner scanner)
    {
        String item = digitarItem(scanner);      
        for(int i = 0; i < listaSupermercado.length; i++)
        {
            if(listaSupermercado[i] == null)
            {   
                listaSupermercado[i] = item;
                System.out.println("Item adicionado com êxito");
                return;
            }
        }
        System.out.println("Lista cheia! Exclua um item.");
    }

    public void listaItens()
    {   
        System.out.println("    [LISTA]");
        for(int i = 0; i < listaSupermercado.length; i++)
        {
            System.out.println(listaSupermercado[i]);
        }
    }

    public void excluiItem(Scanner scanner)
    {     
        String item = digitarItem(scanner);
        for (int i = 0; i < listaSupermercado.length; i++)
        {
            System.out.println("item: " + item + "\ni: " + i);
            if(listaSupermercado[i] != null  && listaSupermercado[i].equals(item))
            {
                listaSupermercado[i] = null;  //Exclui o item
                System.out.println("Item excluído com êxito.");
                return;  //Sai do método imediatamente após a exclusão
            }   

            if(i == listaSupermercado.length - 1)
            {
                System.out.println("Item não encontadrado");
                item = digitarItem(scanner);
                i=-1; //-1 e não 0 porque a variável é incrementada após o bloco de código e antes da próxima iteração.
            }
        }
    }

    public String digitarItem(Scanner scanner)
    {
        System.out.println("Digite o item:");
        String item = scanner.next();
        return item; 
    }
}
