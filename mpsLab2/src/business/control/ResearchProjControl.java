package business.control;
import java.util.List;

import business.model.*;

public abstract class ResearchProjControl {
	
	protected Project projeto;
	
	public final void cadastrarProjeto(Professor professor, AlunoList alunos){
		addProfessor(professor);
		addAlunos(alunos);
	}
	
	private void addProfessor(Professor professor){
		projeto.setProfessor(professor);
	}
	
	abstract void addAlunos(AlunoList alunos);
}
