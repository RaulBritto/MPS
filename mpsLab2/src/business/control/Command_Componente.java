package business.control;
import java.util.Map;

import business.model.Componente;

public interface Command_Componente {
	public void execute(Map<String,Componente> Map_componente, Componente c);
}
