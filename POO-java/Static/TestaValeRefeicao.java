
public class TestaValeRefeicao {
	public static void main(String[] args) {
		System.out.println("valor do vale Refeição: " + Funcionario.valeRefeicao);
		
		System.out.println("Reajuste de 10% no vale Refeicao...");
		Funcionario.reajusteValeRefeicao(0.10);
		
		System.out.println("novo valor de Vale: " + Funcionario.valeRefeicao);
		
//		Funcionario c = new Funcionario();
//		System.out.println("Valor do vale pelo objeto: " + c.valeRefeicao);
		
		
	}
}
