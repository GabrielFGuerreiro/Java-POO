package exercicio13;

public class Apartamento extends Construcao
{
    Construcao ap = new Construcao();

    Apartamento() {ap.setTipo("APARTAMENTO");}

    public void constroi() {System.out.println("CONSTRUINDO: " + ap.getTipo());}
}