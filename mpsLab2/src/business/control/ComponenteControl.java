package business.control;

import java.util.HashMap;
import java.util.Map;

import business.model.Componente;

public class ComponenteControl {
	Map<String, Componente> compMap;
	public ComponenteControl(){
		compMap = new HashMap<String, Componente>();
	}
	public void gerenciarComponente(String nomeComp,int qtdeComp, float valorComp, Command_Componente comComp){
		Componente c = new Componente(nomeComp, qtdeComp, valorComp);
		comComp.execute(compMap, c);
	}
}
