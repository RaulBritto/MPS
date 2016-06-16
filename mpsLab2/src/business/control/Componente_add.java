package business.control;

import java.util.ArrayList;
import java.util.Map;

import business.model.Componente;

public class Componente_add implements Command_Componente {

	public void execute(Map<String,Componente> Mapa_componente, Componente c) {
		// TODO Auto-generated method stub
		Mapa_componente.put(c.getNome(), c);
	}

}
