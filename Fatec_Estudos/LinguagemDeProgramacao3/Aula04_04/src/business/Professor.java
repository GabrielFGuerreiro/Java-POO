package business;

public class Professor extends Pessoa
{
    private String registro;

    public Professor(String nome, String email, String registro)
    {
        super(nome, email);
        this.registro = registro;
    }
    
    public String getRegistro() {return registro;}
}
