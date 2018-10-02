package Banco;

public class TestaCartaoDeCredito {
	public static void main(String[] args) {
		
		CartaoDeCredito cdc1 = new CartaoDeCredito(11111);
//		cdc1.numero = 111111;
		cdc1.dataDeValidade = "01/01/2018";
		
		CartaoDeCredito cdc2 = new CartaoDeCredito(222222);
//		cdc2.numero = 222222;
		cdc2.dataDeValidade = "01/01/2019";
		
		System.out.println("Dados do primeiro cartão");
		System.out.println("Número " + cdc1.numero);
		System.out.println("Data de validade: " + cdc1.dataDeValidade);
		
		System.out.println("----------------------------------------------");
		
		System.out.println("Dados do segundo cartão");
		System.out.println("Número: " + cdc2.numero);
		System.out.println("Data de validade: " + cdc2.dataDeValidade);
		
		System.out.println("--------------------------------------------------");
		
//		Criando os objetos
		CartaoDeCredito cdc = new CartaoDeCredito(19900);
		cdc = cdc1;
		Cliente c = new Cliente();
		c.codigo = 9900;
		
//		Ligando os objetos
		cdc.cliente = c;
		
//		Acessando o nome do Cliente
		cdc.cliente.nome = "Marcos Souza";
		
		System.out.println("Dados do Terceiro cartão");
		System.out.println("Número: " + cdc.numero);
		System.out.println("Data de validade: " + cdc.dataDeValidade);
		System.out.println("Nome do Cliente: " + cdc.cliente.nome);
		System.out.println("Codigo do Cliente: " + cdc.cliente.codigo);

		
	}
}
