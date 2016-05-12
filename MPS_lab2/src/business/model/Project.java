package business.model;

import java.util.LinkedList;

public class Project {
	private Professor professor;
	private LinkedList<Aluno> alunos;
	
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public LinkedList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(LinkedList<Aluno> alunos) {
		this.alunos = alunos;
	}
	public void addAluno(Aluno aluno){
		this.alunos.add(aluno);
	}
	
}
