package business.control;

import java.util.List;

import business.model.Aluno;

public class ResearchProjPibic extends ResearchProjControl{

	@Override
	void addAlunos(AlunoList alunos) {
		AlunoListIterator alunoIterator = alunos.getIterator();
		
		do {
			if(alunoIterator.getAluno().getData_ingresso() < 2015.2)
				projeto.addAluno(alunoIterator.getAluno());
		} while(alunoIterator.next());
	}
}
