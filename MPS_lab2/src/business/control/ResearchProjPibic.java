package business.control;

import java.util.List;

import business.model.Aluno;

public class ResearchProjPibic extends ResearchProjControl{

	@Override
	void addAlunos(List<Aluno> alunos) {
		for(Aluno a : alunos){
			if(a.getData_ingresso() < 2015.2)
				projeto.addAluno(a);
		}
	}
}
