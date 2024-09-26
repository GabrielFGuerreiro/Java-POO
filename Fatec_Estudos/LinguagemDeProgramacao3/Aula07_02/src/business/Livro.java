package business;

public class Livro
{
    private String titulo, genero;
    private int exemplaresDisponiveis;
    private Autor autor; //Associação
    
    public Livro(String titulo, Autor autor, String genero, int exemplaresDisponiveis)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    public String getTitulo() {return titulo;}
    public String getGenero() {return genero;}
    public Autor getAutor() {return autor;}
    public int getExemplaresDisponiveis() {return exemplaresDisponiveis;}

    public void setExemplaresDisponiveis(int exemplaresDisponiveis)
    {
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }
}
