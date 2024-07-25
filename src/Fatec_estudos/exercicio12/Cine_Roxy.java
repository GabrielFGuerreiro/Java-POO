package exemplo12;

public class Cine_Roxy extends Cinemas_Santos
{
    Cine_Roxy()
    {
        //Os méts. consts. não trabalham exclusivamente com atributos, eles podem utilizar métodos
        setLocal("Av. Ana Costa - Gonzaga"); //Passando uma string para o set
        System.out.println("Cine Roxy está localizado: \t" + getLocal()); //Recebendo a string pelo get
    }
}
