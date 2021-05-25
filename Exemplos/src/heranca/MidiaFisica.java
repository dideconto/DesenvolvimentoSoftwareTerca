package heranca;

public abstract class MidiaFisica extends Midia{	
	
	private String editora;
	private int paginas;
	private int edicao;
	
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nEditora: " + editora + "\nPáginas: " + paginas + "\nEdição: " + edicao;
	}
	
	
	
}
