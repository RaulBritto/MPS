package business.control;

import java.util.ArrayList;

public class Componente_careTaker {
	protected ArrayList<ComponenteMemento> estados;
	
	public Componente_careTaker(){
		estados = new ArrayList<ComponenteMemento>();
	}
	public void addMemento(ComponenteMemento CM){
		estados.add(CM);
	}
	public ComponenteMemento retornaUltimoEstado(){
		if(estados.size() <= 0){
			return new ComponenteMemento(0);
		}
		ComponenteMemento estadoAtual = estados.get(estados.size() - 1);
		estados.remove(estados.size() - 1);
		return estadoAtual;
	}

}
