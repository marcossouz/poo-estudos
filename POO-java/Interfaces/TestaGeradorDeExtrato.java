
public class TestaGeradorDeExtrato {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaPoupanca();
		
		c1.deposita(500);
		c2.deposita(500);
		
		GeradorDeExtrato g = new GeradorDeExtrato();
		g.geraExtrato(c1);
		g.geraExtrato(c2);
	}
}
