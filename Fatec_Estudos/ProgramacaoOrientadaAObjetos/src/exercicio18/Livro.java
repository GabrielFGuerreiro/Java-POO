package exercicio18;

public class Livro
{
    private String titulo, autor;

    Livro(){}
    Livro(String mensagem){System.out.println(mensagem);}

    public void setTitulo(String titulo) {this.titulo=titulo;}
    public void setAutor(String autor) {this.autor=autor;}
    public String getTitulo() {return titulo;}
    public String getAutor() {return autor;}

    public void Consulta_livros(){System.out.println("Ciência da computção");}
}
