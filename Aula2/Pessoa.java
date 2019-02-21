
public class Pessoa {
	private String name;
	private int idade;
	private double peso;
	
	public Pessoa(String name, int idade, double peso) {
		this.name = name;
		this.idade = idade;
		this.peso = peso;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return "Nome: " + this.name + "\nIdade: " + this.idade + "\nPeso: " + this.peso;
	}
}
