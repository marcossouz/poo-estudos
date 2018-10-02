package Escola;

public class TestaMetodosFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		f.nome = "Marcos Souza";
		f.salario = 1200;
		
		System.out.println("Dados iniciais");
		f.dadosFunc();
		
		System.out.println("------------------------------");
		System.out.println("Ajuste de salario");
		f.ajusteDeSalario(300);
		f.dadosFunc();
		
	}
}
