package business;

public class Materia
{
    private String topico, descricao;

    public Materia(String topico, String descricao)
    {
        this.topico = topico;
        this.descricao = descricao;
    }

    public String getTopico() {return topico;}
    public String getDescricao() {return descricao;}
}
