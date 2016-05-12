package business.control;
import java.util.List;

import business.model.*;

public abstract class ResearchProjControl {
	
	protected Project projeto;
	
	public final void cadastrarProjeto(Professor professor, List<Aluno> alunos){
		addProfessor(professor);
		addAlunos(alunos);
	}
	
	private void addProfessor(Professor professor){
		projeto.setProfessor(professor);
	}
	
	abstract void addAlunos(List<Aluno> alunos);
}
