import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        ListaSupermercado lista = new ListaSupermercado();

        while(true)
        {   
            System.out.println("     [MENU]\n1.Adicionar item\n2.Excluir item\n3.Listar itens\n4.Sair");
            System.out.println("Digite sua opção:");
            Scanner scanner = new Scanner(System.in);
            int op = scanner.nextInt();

            switch (op)
            {
                case 1:
                    lista.adicionaItem(scanner);
                    break;

                case 2:
                    lista.excluiItem(scanner);
                    break;

                case 3:
                    lista.listaItens();
                    break;

                case 4:
                    System.out.println("Encerrando...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
