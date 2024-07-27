package exercicio11;

public class Matricula extends Quarto_ciclo_ADS
{
    /*É possível que uma classe não tenha atributos/métodos e sim uma funcionalidade específica,
    por isso essa classe também tem o método main*/
    public static void main(String [] args)
    {
        Quarto_ciclo_ADS E = new Quarto_ciclo_ADS();

        E.setMatricula("RA122000");
        System.out.println("Matrícula: \t" + E.getMatricula());
    }
}
