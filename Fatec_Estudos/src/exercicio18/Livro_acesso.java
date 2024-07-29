package exercicio18;

public class Livro_acesso
{
    public static void main(String[] args)
    {
        Livro c = null;
        Acessa_classe("y",c);
        Acessa_classe("z",c);
        Acessa_classe("x",c);
        Acessa_classe("g",c);
    }

    public static void Acessa_classe(String a, Livro c)
    {
        if(a == "x")
            c=new Livro();
        else if (a=="y")
            c=new Tipo_romance("Autor importance: José de Alencar");
        else if (a=="z")
            c=new Tipo_espirita("Autor importante: Chico Xavier");
        else
             c=new Tipo_acao("Autor importante: Autor ação");

        c.Consulta_livros();
    }
}