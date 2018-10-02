
public class Funcionario {
	public String nome;
	public double salario;
	public static double valeRefeicao = 5;
	
	public static void reajusteValeRefeicao(double taxa){
		Funcionario.valeRefeicao += Funcionario.valeRefeicao * taxa;
	}
}
