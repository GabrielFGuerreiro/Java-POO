package exercicio15;

public class Fatec
{
    private String nomecurso;
    private int qntdalunos;

    public Fatec()
    {
        nomecurso = "";
        qntdalunos = 0;
    }

    public void setNomecurso(String nomecurso)
    {this.nomecurso = nomecurso;}

    public String getNomecurso()
    {return nomecurso;}

    public void setQNTDalunos(int qntdalunos)
    {this.qntdalunos = qntdalunos;}

    public int getQNTDalunos()
    {return qntdalunos;}

    public void mostracurso()
    {System.out.println("Nome do curso: " + nomecurso +
    "\nQuantidade de alunos: " + qntdalunos);}

    public void attalunos(int matriculas)
    {qntdalunos = qntdalunos + matriculas;}
}
