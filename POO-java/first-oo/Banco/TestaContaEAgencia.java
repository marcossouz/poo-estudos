package Banco;

public class TestaContaEAgencia {
	public static void main(String[] args) {
		Agencia a = new Agencia(178);
		Conta c = new Conta(a);
		
//		a.numero = 178;
	
		c.numero = 123;
		c.saldo = 1000;
		c.limite = 500;
		
		System.out.println("Dados da agência");
		System.out.println("Número: " + a.numero);
		
		System.out.println("---------------------------");
		
		System.out.println("Dados da conta");
		System.out.println("Número: " + c.numero);
		System.out.println("Saldo: " + c.saldo);
		System.out.println("Limite: " + c.limite);
		
		c.agencia = a;
		
		System.out.println("Dados da agência obtidos atraves da conta");
		System.out.println(c.agencia.numero);
	}
}
