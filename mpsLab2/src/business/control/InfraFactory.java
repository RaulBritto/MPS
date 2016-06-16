package business.control;

import infra.UserFile;

public class InfraFactory {
	
	public UserFile getFile(){
		return new UserFile();
		
	}
}
