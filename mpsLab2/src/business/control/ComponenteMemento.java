package business.control;

public class ComponenteMemento {
	protected int estadoQtde;
	
	public ComponenteMemento(int q){
		estadoQtde = q;
	}
	
	public int getQtdeMemento(){
		return estadoQtde;
	}
}
