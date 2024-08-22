 
public class Acessa_facul
{
    public static void main(String[] args)
    {
        Facul_CEETEP ceetep = new Facul_CEETEP();
        Disciplinas disciplinas = new Disciplinas();

        ceetep.setFatec("Rubens Lara");
        System.out.println("Fatec: \t"+ceetep.getFatec());

        ceetep.setFacul("ADS");
        System.out.println("Faculdade \t"+ceetep.getFacul());

        disciplinas.setDisciplina("POO");
        System.out.println("Disciplina \t"+disciplinas.getDisciplina());
    }

}