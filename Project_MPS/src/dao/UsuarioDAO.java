package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import business.model.Usuario;
import business.util.IRepositoryUsuario;

public class UsuarioDAO implements IRepositoryUsuario {

	private Map<String, Usuario> usuarios;

	public UsuarioDAO() {
		this.usuarios = new HashMap<String, Usuario>();
	}

	@Override
	public void cadastrarUsuario(Usuario usuario) {

		if (this.usuarios.containsKey(usuario.getLogin()) == false) {
			this.usuarios.put(usuario.getLogin(), usuario);
		}

	}

	@Override
	public Usuario buscarUsuarioPorLogin(String login) {
		Usuario usuario = this.usuarios.get(login);
		return usuario;

	}

	@Override
	public void deletarUsuario(String login) {
		if (this.usuarios.containsKey(login)) {
			this.usuarios.remove(login);
		}
	}

	@Override
	public List<Usuario> listarUsuarios() {
		List<Usuario> list = new ArrayList<>();
		Iterator entries = this.usuarios.keySet().iterator();

		while (entries.hasNext()) {
			Object key = entries.next();
			Object item = usuarios.get(key);
			list.add((Usuario) item);
		}
		return list;
	}
}
