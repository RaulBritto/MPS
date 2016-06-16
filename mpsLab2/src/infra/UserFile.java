package infra;
import business.model.Usuario;
import java.io.*;
import java.util.Map;

public class UserFile { 
	
	public void saveMap(Map<String, Usuario> m){
		try{
		FileOutputStream fileOut = new FileOutputStream("users.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(m);
		out.close();
		fileOut.close();
		System.out.println("Mapa salvo em /temp/users.txt ");
		} catch(IOException i) {
			i.printStackTrace();
		}
	}
	
	
	public void loadMap(Map<String, Usuario> m){
		try{
			FileInputStream fileIn = new FileInputStream("users.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			m = (Map<String, Usuario>) in.readObject();
			in.close();
			fileIn.close();
			
			
			
		} catch (IOException i ){
			i.printStackTrace();
		} catch(ClassNotFoundException c){
			System.out.println("Map not Found!!!!!!!\n");
			c.printStackTrace();
		}
		
	}
	
	
}