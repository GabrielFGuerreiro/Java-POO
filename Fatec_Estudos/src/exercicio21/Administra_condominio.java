package Abstrata;

public class Administra_condominio
{
    public static void main (String[] args)
    {
        Condominio b = new Condominio();
        Conceito c = new Condominio();

        final double a = 234.08;

        System.out.println("Nome do condomínio "+b.getNome());
        System.out.println("Valor do condomínio "+b.calcula_condominio(a));

        c.endereco_condominio();
    }    
}
