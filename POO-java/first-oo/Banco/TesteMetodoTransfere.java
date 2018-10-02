package Banco;

public class TesteMetodoTransfere {
	public static void main(String[] args) {
		Agencia a = new Agencia(1234);
		
		Conta origem = new Conta(a);
		origem.saldo = 1000;
		System.out.println("Saldo da primeira conta: " + origem.saldo);
		
		Conta destino = new Conta(a);
		destino.saldo = 1000;
		System.out.println("Saldo da segunda conta: " + destino.saldo);
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("realizando a transfer�ncia");
		origem.transfere(destino, 500);
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Saldo da primeira conta: " + origem.saldo );
		System.out.println("Saldo da segunda conta: " + destino.saldo);
	}
}
