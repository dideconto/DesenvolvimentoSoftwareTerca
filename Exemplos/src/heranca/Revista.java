package heranca;

public class Revista extends MidiaFisica{
	
	public Revista(String dono) {
		super(dono);
	}

	private String reportagem;

	public String getReportagem() {
		return reportagem;
	}

	public void setReportagem(String reportagem) {
		this.reportagem = reportagem;
	}

	@Override
	public String toString() {
		return super.toString() + "\nReportagem: " + reportagem;
	}

	@Override
	public String retornarTipo() {
		return super.retornarTipo() + "Tipo Revista";
	}

	@Override
	public void obrigarImplementaçãoClasseFilha() {
		// TODO Auto-generated method stub
		
	}

}


