package Escola;

public class Funcionario {
	public String nome;
	public double salario;
	
	public void ajusteDeSalario(double valor){
		this.salario += valor;
	}
	
	public void dadosFunc(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario: " + this.salario);
	}
}
