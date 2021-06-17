package models;

import java.util.ArrayList;
import java.util.Date;

public class Venda {
	
	public Venda() {
		setCriadoEm(new Date());
	}

	private Date criadoEm;
	private Cliente cliente;
	private Vendedor vendedor;
	private ArrayList<ItemVenda> itens;
	
	public ArrayList<ItemVenda> getItensVenda() {
		return itens;
	}
	public void setItens(ArrayList<ItemVenda> itensVenda) {
		this.itens = itensVenda;
	}
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

}












