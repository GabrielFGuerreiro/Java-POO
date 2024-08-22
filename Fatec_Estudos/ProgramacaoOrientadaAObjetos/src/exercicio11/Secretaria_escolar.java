package exercicio11;

public class Secretaria_escolar
{
    private String nome_aluno, curso_aluno, matricula_aluno;
    private int idade_aluno;
    private double media_aluno;

    public Secretaria_escolar() {}
    public Secretaria_escolar(String nome_aluno, int idade_aluno, double media_aluno, String curso_aluno)
    {
        this.nome_aluno=nome_aluno;
        this.idade_aluno=idade_aluno;
        this.media_aluno=media_aluno;
        this.curso_aluno=curso_aluno;
    }

    public void setMatricula(String matricula_aluno) {this.matricula_aluno=matricula_aluno;}

    public String getNome() {return nome_aluno;}
    public int getIdade() {return idade_aluno;}
    public double getMedia() {return media_aluno;}
    public String getMatricula() {return matricula_aluno;}
    public String getCurso() {return curso_aluno;}
}
