package business.control;

import java.util.Map;

import business.model.Componente;

public class Componente_search implements Command_Componente {

	public void execute(Map<String,Componente> Mapa_componente, Componente c) {
		// TODO Auto-generated method stub
		if(Mapa_componente.containsKey(c.getNome())){
			System.out.println("O elemento " + c.getNome() + " está no arraylist");
			Componente resultado = Mapa_componente.get(c.getNome());
			resultado.toString();
		}else{
			System.out.println("O elemento " + c.getNome() + " não está no arraylist");
		}
		
	}

}
