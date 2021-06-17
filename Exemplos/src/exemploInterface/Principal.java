package exemploInterface;

public class Principal {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Diogo Deconto");
		cliente.setCpf("111.111.111-11");
		
		ClienteController controller = new ClienteController();
		controller.cadastrar(cliente);
		if(controller.cadastrar(cliente)) {
			System.out.println("Cliente cadastrado com sucesso!");
		}else {
			System.out.println("Esse cliente já existe");
		}
		
		cliente = controller.buscarPorCpf("111.111.111-11");
		System.out.println(cliente);
		
		for(Cliente clienteCadastrado : controller.listar()) {
			System.out.println(clienteCadastrado);
		}
		
	}

}
