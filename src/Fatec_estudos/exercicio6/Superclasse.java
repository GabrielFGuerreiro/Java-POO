//Herença
package exemplo6;

public class Superclasse
{
    private String atributo1;

    Superclasse()
    {
        System.out.println("Acesso ao método construtor da Superclasse");
    }

    public void setAtributo1(String atributo1)
    {
        this.atributo1 = atributo1;
    }

    public String getAtributo1()
    {
        return atributo1;
    }
}