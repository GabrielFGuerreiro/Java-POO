package business;

import java.util.ArrayList;

public class Aula
{
    //Associações
    private Professor professor;
    private ArrayList<Aluno> alunos; //ArrayList do tipo Aluno
    private Disciplina disciplina;
    private Materia materia;

    public Aula(Professor professor, ArrayList<Aluno> alunos, Disciplina disciplina, Materia materia)
    {
        this.professor = professor;
        this.alunos = alunos;
        this.disciplina = disciplina;
        this.materia = materia;
    }

    public void mostraInformacoes()
    {
        System.out.println("Código da Disciplina: " + disciplina.getCodigo());
        System.out.println("Nome do Professor: " + professor.getNome());
        System.out.println("Tópico da Matéria: " + materia.getTopico());
        System.out.println("Alunos Presentes:");
        //Declara uma variável aluno do tipo Aluno para armazenar cada item da list alunos durante a iteração
        for(Aluno aluno : alunos)
        {
            System.out.println(" - " + aluno.getNome());
        }
    }
}