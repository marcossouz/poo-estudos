
public class TesteConta {
	public static void main(String[] args) {
		Conta c = new Conta();
		
		c.setNome("Marcos");
		c.setSaldo(2000);
		c.setLimite(500);
		
		System.out.println("Nome: " + c.getNome());
		System.out.println("Saldo: " + c.getSaldo());
		System.out.println("Limite: " + c.getLimite());
	}
}
