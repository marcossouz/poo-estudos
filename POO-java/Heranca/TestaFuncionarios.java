
public class TestaFuncionarios {
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setNome("Marcos Souza");
		g.setSalario(2000);
		g.setUsuario("marcos.souza");
		g.setSenha("12345");
		
		Telefonista t = new Telefonista();
		t.setNome("Carolina Mello");
		t.setSalario(1000);
		t.setEstacaoDeTrabalho(13);
		
		Secretaria s = new Secretaria();
		s.setNome("Tatiane Andrade");
		s.setSalario(1500);
		s.setRamal(198);
		
		System.out.println("GERENTE");
//		System.out.println("Nome: " + g.getNome());
//		System.out.println("Sal�rio: " + g.getSalario());
//		System.out.println("Usu�rio: " + g.getUsuario());
//		System.out.println("Senha: " + g.getSenha());
//		System.out.println("Bonifica��o: " + g.calculaBonificacao());
		g.mostraDados();
		
		System.out.println("TELEFONISTA");
//		System.out.println("Nome: " + t.getNome());
//		System.out.println("Sal�rio: " + t.getSalario());
//		System.out.println("Esta��o de trabalho: " + t.getEstacaoDeTrabalho());
//		System.out.println("Bonifica��o: " + t.calculaBonificacao());
		t.mostraDados();
		
		System.out.println("SECRETARIA");
//		System.out.println("Nome: " + s.getNome());
//		System.out.println("Sal�rio: " + s.getSalario());
//		System.out.println("Ramal: " + s.getRamal());
//		System.out.println("Bonifica��o: " + s.calculaBonificacao());
		s.mostraDados();
		
	}
}
