package business.control;
import java.util.ArrayList;
import java.util.List;
import business.model.*;

public class AlunoList {

	public List<Aluno> alunoList;
	public AlunoListIterator itAluno;
	
	public AlunoList() {
	
		alunoList = new ArrayList<Aluno>();
		
	}
	public void addAluno(Aluno aluno){
		alunoList.add(aluno);
		
	}
	public AlunoListIterator getIterator(){
		return new AlunoListIterator(alunoList);
	} 
}
