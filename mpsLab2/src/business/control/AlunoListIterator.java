package business.control;

import java.util.List;
import business.model.*;

public class AlunoListIterator {
	private List<Aluno> alunosList;
	private int estado;
	
	public AlunoListIterator(List<Aluno> alunoList){
		alunosList = alunoList;
	}
	public Aluno getAluno(){
		return alunosList.get(estado);
	}
	
	public boolean next(){
		if(alunosList.size() < estado){
			estado++;
			return true;
		}
		return false;
	}
}