package Banco;

public class TestaGerente {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.salario = 1000;
		
		System.out.println("Sal�rio: " + g.salario);
		
		System.out.println("Aumentando o sal�rio em 10%");
		g.aumentaSalario();
		
		System.out.println("Sal�rio: " + g.salario);
		
		System.out.println("Aumentando o sal�rio em 30%");
		g.aumentaSalario(0.3);
		
		System.out.println("Sal�rio: " + g.salario);
	}
}
