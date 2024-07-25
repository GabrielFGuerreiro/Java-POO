
public class Plano_consulta
{
    public static void  main(String[] args)
    {
        //Plano de ensino 1
        //1. Inicializa os valores do plano 1 como padrões
        Plano_de_ensino plano1 = new Plano_de_ensino();

        //1.2. Inicializa os valores do plano 1, enviando como parâmetros
        plano1.setMat("Matéria1");
        plano1.setCont("Conteúdo1");
        plano1.setAva("A1+A2");
        plano1.setBibli("Autor1");

        //1.5. Printando os valores das variáveis pelo plano 1
        System.out.println(plano1.getMat()); //(chamando os gets pelo plano 1)
        System.out.println(plano1.getCont());
        System.out.println(plano1.getAva());
        System.out.println(plano1.getBibli());

        //Plano de ensino 2
        //2. Inicializando os valores do plano 2 pelo método construtor perso
        Plano_de_ensino plano2 = new Plano_de_ensino("Matéria2","Conteúdo2","T1 e A2","Autor 2");

        //2.3. Printando os valores das variáveis pelo plano 2
        System.out.println(plano2.getMat()); //(chamando os gets pelo plano 2)
        System.out.println(plano2.getCont());
        System.out.println(plano2.getAva());
        System.out.println(plano2.getBibli());
    }
}