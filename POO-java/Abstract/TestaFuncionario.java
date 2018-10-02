
public class TestaFuncionario {
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		
		g.setNome("Marcos Souza");
		g.setSalario(1200);
		g.calculaBonificacao();
		
		
		System.out.println("Nome: " + g.getNome());
		System.out.println("Salário: " + g.getSalario());
	}
}
