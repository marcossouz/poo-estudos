
public class TestaPoolDeStrings {
	public static void main(String[] args) {
		String nome1 = "Marcos Souza";
		String nome2 = "Marcos Souza";
		
		//exibe true
		System.out.println(nome1 == nome2);
		
		//exibe true
		System.out.println(nome1.equals(nome2));
		
		String nome3 = new String("Marcos Souza");
		String nome4 = new String("Marcos Souza");
		
		//exibe false
		System.out.println(nome3 == nome4);
		
		//exibe true
		System.out.println(nome3.equals(nome4));
	}
}
