package Abstrata;

public class Condominio extends Conceito
{
    protected String getNome() {return "Vila Nova";}

    protected double calcula_condominio(double a) {return a*1.066;}

    //implementação do método abstrato
    public void endereco_condominio()
    {
        System.out.println("Rua A, nº 22");     
    }
}
