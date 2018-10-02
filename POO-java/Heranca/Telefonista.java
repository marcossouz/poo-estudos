
public class Telefonista extends Funcionario{
	private int estacaoDeTrabalho;

	public int getEstacaoDeTrabalho() {
		return estacaoDeTrabalho;
	}

	public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
		this.estacaoDeTrabalho = estacaoDeTrabalho;
	}
	
	public void mostraDados(){
		super.mostraDados();
		System.out.println("Estação de trabalho: " + this.getEstacaoDeTrabalho());
	}
}
