package Banco;

public class TestaAgencia {
	public static void main(String[] args) {
		Agencia a1 = new Agencia(1234);
//		a1.numero = 1234;
		
		Agencia a2 = new Agencia(5678);
//		a2.numero = 5678;
		
		System.out.println("Dados da primeira agência");
		System.out.println("Número: " + a1.numero);
		
		System.out.println("---------------------------------");
		
		System.out.println("Dados da segunda agência");
		System.out.println("Número: " + a2.numero);
		
	}
}
