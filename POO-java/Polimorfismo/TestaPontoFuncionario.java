
public class TestaPontoFuncionario {
	public static void main(String[] args) {
		Ponto p = new Ponto();
		Gerente g = new Gerente();
		Telefonista t = new Telefonista();
		
		p.entrada(g);
		p.saida(g);
		
		p.entrada(t);
		p.saida(t);
		
		System.out.println("GERENTE ");
		System.out.println("Entrada: " + g.getEntrada());
		System.out.println("Saida: " + g.getSaida());
		
		System.out.println("TELEFONISTA ");
		System.out.println("Entrada: " + t.getEntrada());
		System.out.println("Saida: " + t.getSaida());
	}
}
