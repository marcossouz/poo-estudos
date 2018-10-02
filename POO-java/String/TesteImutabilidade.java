
public class TesteImutabilidade {
	public static void main(String[] args) {
		String nome = "Marcos Souza";
		
		String nomeAlterado = nome.toUpperCase();
		
		//Exibe Marcos Souza
		System.out.println(nome);
		
		//Exibe MARCOS SOUZA
		System.out.println(nomeAlterado);
	}
}
