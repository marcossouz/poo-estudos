
public class Teste {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		f.setNome("Marcos Soza");
		f.setSalario(2000);
		
		System.out.println("Nome: " + f.getNome());
		System.out.println("Salario: " + f.getSalario());
	}
}
