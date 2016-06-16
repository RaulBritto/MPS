package business.control;

import business.model.*;
import infra.*;
import java.util.HashMap;
import java.util.Map;

public class UserControl {
	Map<String, Usuario> uMap;
	UserFile userFile;
	InfraFactory IF;
	public SigaaAdapter SA; 
	
	public UserControl(){
		uMap = new HashMap<String, Usuario>();
		SA = new SigaaAdapter();
		IF = new InfraFactory();
		userFile = IF.getFile();
		userFile.loadMap(uMap);
	}
	
	public void addUser(Usuario u) throws UserException, PasswordException{
		//LOGIN
		userFile.loadMap(uMap);
		
		if(u.getLogin().length() > 20){
			throw new UserException("Nome de usuário muito grande!");
		}
		if(u.getLogin().isEmpty()){
			throw new UserException("Nome de usuário vazio!");
		}
		if(u.getLogin().matches(".*\\d.*")){
			throw new UserException("Nome de usuário contém números");
		}
		//SENHA
		if(u.getSenha().length() > 12){
			throw new PasswordException("Senha muito grande");
		}
		if(u.getSenha().length() < 8){
			throw new PasswordException("Senha muito curta");
		}
		if(u.getSenha().matches("^(?=.*?\\d.*\\d)[a-zA-Z0-9]{8,}$")){
			throw new PasswordException("Senha deve ter ao menos 2 numeros e letras");
		}
		//SIGAA
		SA.confirma_Mat(u.getMatricula(), u.getName());
		
		uMap.put(u.getLogin(), u);
		userFile.saveMap(uMap);
		//cria metodo validadador ou adiciona as validações aqui.
	}
	public void Remove(Usuario u){
		uMap.remove(u);
		userFile.saveMap(uMap);
	}
	public void Update(String login, String oldPassword, String newPassword) throws PasswordException{
		Usuario achado = uMap.get(login);
		//digita a nova senha
		//altera o setPassword();
		//no caso esse teste é só para planos futuros!
		if(achado.getSenha().equals(oldPassword)){
			achado.setSenha(newPassword);
		}
		else{
			throw new PasswordException("Senha errada!");
		}
		userFile.saveMap(uMap);
	}
	public Map<String, Usuario> ListUsers(){
		userFile.loadMap(uMap);
		for(Map.Entry<String, Usuario> entry : uMap.entrySet()){
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
			
		return uMap;
	}
}
