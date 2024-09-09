package business;

public class Disciplina
{
    private String codigo, ementa;

    public Disciplina(String codigo, String ementa)
    {
        this.codigo = codigo;
        this.ementa = ementa;
    }
    
    public String getCodigo() {return codigo;}
    public String getEmenta() {return ementa;}
}
