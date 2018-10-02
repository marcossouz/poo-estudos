package Escola;

public class TestaFuncionario {
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.nome = "Marcos";
		f1.salario = 2000;
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Elly";
		f2.salario = 2500;
		
		System.out.println("Dados funcionario 1");
		System.out.println("Nome: " + f1.nome);
		System.out.println("Salario: " + f1.salario);
		
		System.out.println("-------------------------");
		
		System.out.println("Dados funcionario 2");
		System.out.println("Nome: " + f2.nome);
		System.out.println("Salario: " + f2.salario);
	}
}
