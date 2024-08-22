package view;

import business.Aluno;
import business.Professor;

public class Principal
{
    public static void main(String[] args) {
       		// instancia objeto da classe Aluno
		Aluno aluno1 = new Aluno("Walace", "walace@fatec", 123);
		// executa método/comportamento esperado de aluno
		System.out.println(aluno1.cumprimentar());
		
		Professor prof1 = new Professor("Rubens Lara", "rubens@fatec");
		System.out.println(prof1.cumprimentar());
		
		Professor prof2 = new Professor("Lara", "lara@fatec");
		System.out.println(prof2.cumprimentar("Dr."));
    }
}
