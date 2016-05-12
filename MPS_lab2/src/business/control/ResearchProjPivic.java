package business.control;

import java.util.List;

import business.model.Aluno;

public class ResearchProjPivic extends ResearchProjControl {

	@Override
	void addAlunos(List<Aluno> alunos) {
		for(Aluno a : alunos){
			projeto.addAluno(a);
		}
	}
}