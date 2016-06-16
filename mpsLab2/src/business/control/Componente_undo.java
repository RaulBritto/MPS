package business.control;

import java.util.Map;

import business.model.Componente;

public class Componente_undo implements Command_Componente {

	public void execute(Map<String, Componente> Mapa_componente, Componente c) {
		// TODO Auto-generated method stub
		if (Mapa_componente.containsKey(c.getNome())) {
			ComponenteMemento CM = c.C_CT.retornaUltimoEstado();
			int value = CM.getQtdeMemento();
			c.setQtde(value);

		}

	}

}
