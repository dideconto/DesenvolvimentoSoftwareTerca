package modelagem;

public class Principal {

	static Cliente cliente;
	
	public static void main(String[] args) {
		
		cliente = new Cliente();
		cliente.setNome("Diogo");
		cliente.setCpf("123");
		System.out.println(cliente);
		
		cliente = new Cliente();
		System.out.println(cliente);
		
//		Cliente cliente1 = new Cliente();
//		cliente1.setNome("Diogo");
//		cliente1.setCpf("123");
//		
//		Cliente cliente2 = new Cliente("258");
//		cliente2.setNome("José");
//		cliente2.setCpf("456");
//		
//		System.out.println(cliente1.equals(cliente2));
//		
//		System.out.println(cliente1);
//		System.out.println(cliente2);
		
	}
}












