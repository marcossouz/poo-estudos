
public class NaoEsportista extends Pessoa{
	public NaoEsportista(String name, int idade, double peso, String dataUltimoTreino) {
		super(name, idade, peso);
		this.dataUltimoTreino = dataUltimoTreino;
	}
	private String dataUltimoTreino;
	private String tipoUltimoTreino;
	
	public String getDataUltimoTreino() {
		return dataUltimoTreino;
	}
	public void setDataUltimoTreino(String dataUltimoTreino) {
		this.dataUltimoTreino = dataUltimoTreino;
	}
	public String getTipoUltimoTreino() {
		return tipoUltimoTreino;
	}
	public void setTipoUltimoTreino(String tipoUltimoTreino) {
		this.tipoUltimoTreino = tipoUltimoTreino;
	}
	
	public String toString() {
		return super.toString() + "\ntipo de ultimo treino: " + this.tipoUltimoTreino + "\nData do ultimo treino: " + this.dataUltimoTreino;
	}
	
}
