package view;

import java.util.ArrayList;

import business.Aluno;
import business.Aula;
import business.Disciplina;
import business.Materia;
import business.Professor;

public class Principal
{
    public static void main(String[] args)
    {
        Professor professor1 = new Professor("Davi", "davi_fatec@gmail.com", "123456");
        Disciplina disciplina1 = new Disciplina("PROG-101",
        "Introdução a lógica de programação.");
        Materia materia1 = new Materia("Estruturas de Controle",
        "Estudo das estruturas que controlam o fluxo de execução do programa");

        //Cria uma ArrayList para armazenar objetos do tipo Aluno
        ArrayList<Aluno> alunos = new ArrayList<>();
        //Adiciona objetos Aluno à lista
        alunos.add(new Aluno("Gabriel", "gabriel_fatec@gmail.com","100100"));
        alunos.add(new Aluno("Maria", "Maria_fatec@gmail.com","100200"));
        alunos.add(new Aluno("João", "João_fatec@gmail.com","100300"));
          
        //Passando os objetos pelo construtor de aula.
        //O objeto aula1 agora pode acessar todos os valores dos outros objetos.
        Aula aula1 = new Aula(professor1, alunos, disciplina1, materia1);
        
        aula1.mostraInformacoes();
    }
}
