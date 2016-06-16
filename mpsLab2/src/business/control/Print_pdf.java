package business.control;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import business.model.Usuario;

public class Print_pdf implements Print_Info {

	public void save_Info(Usuario u, String value) {
		try{
			File arch = new File(value+".pdf");
			if(!arch.exists()){
				arch.createNewFile();
			}
			FileWriter FW = new FileWriter(arch.getAbsoluteFile());
			BufferedWriter BW = new BufferedWriter(FW);
			BW.write(u.toString());
			BW.write(value);
		}catch(IOException e){
			CodeException CE = new CodeException();
		}
	}
	
}