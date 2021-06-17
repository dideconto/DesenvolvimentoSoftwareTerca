package exemploInterface;

import java.util.ArrayList;

public interface ICliente {
	public boolean cadastrar(Cliente c);
	public ArrayList<Cliente> listar();
	public Cliente buscarPorCpf(String cpf);
}
