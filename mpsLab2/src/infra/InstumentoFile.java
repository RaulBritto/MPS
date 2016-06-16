package infra;
import business.model.Instrumento;
import java.io.*;
import java.util.ArrayList;
public class InstumentoFile { 
	
	public void saveList(ArrayList<Instrumento> list){
		try{
		FileOutputStream fileOut = new FileOutputStream("instrumentos.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(list);
		out.close();
		fileOut.close();
		System.out.println("Salvo em /temp/Instumentos.txt ");
		} catch(IOException i) {
			System.err.println("Erro ao encontrar arquivo!");
		}
	}
	
	
	public void loadList(ArrayList<Instrumento> list){
		try{
			FileInputStream fileIn = new FileInputStream("instrumentos.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			list = (ArrayList<Instrumento>) in.readObject();
			in.close();
			fileIn.close();
			
			
			
		} catch (IOException i ){
			i.printStackTrace();
		} catch(ClassNotFoundException c){
			System.out.println("Arquivo not  Found!!!!!!!\n");
			c.printStackTrace();
		}
		
	}
	
	
}