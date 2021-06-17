package exemploInterface;

import java.util.ArrayList;

public class ClienteController implements ICliente {
	
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	@Override
	public boolean cadastrar(Cliente c) {
		if(buscarPorCpf(c.getCpf()) == null) {
			clientes.add(c);
			return true;
		}
		return false;
	}

	@Override
	public ArrayList<Cliente> listar() {
		return clientes;
	}

	@Override
	public Cliente buscarPorCpf(String cpf) {
		for(Cliente clienteCadastrado : clientes) {
			if(clienteCadastrado.getCpf().equals(cpf)) {
				return clienteCadastrado;
			}
		}
		return null;
	}
}











