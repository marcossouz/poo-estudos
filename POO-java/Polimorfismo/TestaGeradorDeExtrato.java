
public class TestaGeradorDeExtrato {
	public static void main(String[] args) {
		GeradorDeExtrato gerador = new GeradorDeExtrato();
		
		Poupanca cp = new Poupanca();
		cp.setSaldo(1000);
		
		Corrente cc = new Corrente();
		cc.setSaldo(1000);
		
		gerador.imprimeExtratoBasico(cp);
		gerador.imprimeExtratoBasico(cc);
	}
}
