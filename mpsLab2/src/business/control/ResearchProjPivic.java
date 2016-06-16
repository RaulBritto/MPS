package business.control;

public class ResearchProjPivic extends ResearchProjControl {

	@Override
	void addAlunos(AlunoList alunos) {
		AlunoListIterator iterator = alunos.getIterator();
		
		do {
			projeto.addAluno(iterator.getAluno());
		} while(iterator.next());
	}
}