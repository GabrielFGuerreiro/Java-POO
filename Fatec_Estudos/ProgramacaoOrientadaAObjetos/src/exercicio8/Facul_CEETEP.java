 
public class Facul_CEETEP extends CPS
{
    private String facul;

    public Facul_CEETEP()
    {
        super("Santos"); //acessando o metódo constr. da classe hierarquicamente superior
    }

    public void setFacul(String facul) {this.facul=facul;}
    
    public String getFacul() {return facul;}
}