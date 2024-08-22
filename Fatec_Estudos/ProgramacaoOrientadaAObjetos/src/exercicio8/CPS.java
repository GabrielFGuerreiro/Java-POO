 
public class CPS
{
    private String fatec,cidade;
    
    //recebendo pelo super()
    public CPS(String cidade)
    {
        this.cidade=cidade;
        System.out.println("Método construtor da superclasse \n"+"Cidade: "+cidade);
    }

    public void setFatec(String fatec) {this.fatec=fatec;}

    public String getFatec() {return fatec;}  
}
