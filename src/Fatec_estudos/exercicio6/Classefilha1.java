 
//Classefilha1 herda os atributos e métodos de Superclasse
public class Classefilha1 extends Superclasse
{
    private String atributo2;

    Classefilha1()
    {
        //chamando construtor da Superclasse
        super();
        System.out.println("Acesso ao método cosntrutor da Classefilha1");
    }

    public void setAtributo2(String atributo2)
    {
        this.atributo2=atributo2;
    }

    public String getAtributo2()
    {
        return atributo2;
    }
}