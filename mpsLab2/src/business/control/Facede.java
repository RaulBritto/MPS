package business.control;
import infra.InstumentoFile;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import business.model.Instrumento;
public class Facede {
	
	private ArrayList<Instrumento> list;
	private InstumentoFile userFile;
	
	public Facede(){
		list = new ArrayList<Instrumento>();
		userFile = new InstumentoFile();
	}
	
	
	public void addInstrument(String name,String brand, int quant, int code, String description){
		list.add(new Instrumento(name, brand,quant, code, description));
		userFile.saveList(list);
	}
	
	public int sizeList(){
		return list.size();
	}
	
	public void listInstrument(){
		if(!listEmpty()){
			//userFile.loadList(list);
			JOptionPane.showMessageDialog(null, list.toString());	
		}
	}
	
	public boolean listEmpty(){
		if(list.isEmpty()){
			JOptionPane.showMessageDialog(null, "Sem resultados!");
			return true;			
		}
		else return false;
	}
	
	
	public void removeInstrument(String name){
		for(int i = 0; i < list.size(); i++)
		{
			Instrumento a =  list.get(i);
			if(a.getName().equals(name)) list.remove(i);
		}
		//userFile.saveList(list);
	}
}