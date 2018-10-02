package start;

public class Start {
	public static void main(String[] args){
//		static public void main(String[] args)
//		public static void main(String args[])
//		public static void main(String[] parametros)
		
//		System.out.println("Olá Mundo");
		
		
		/** Quando se executa com argumentos na hora da execução
		 * exemplo: 
		 * home$ ls
		 * programa.class Programa.java
		 * java Programa Java Marcos Souza
		 * Resultado:
		 * $ Java
		 * $ Marcos
		 * $ Souza */
		for(int i = 0; i < args.length; i++){
			System.out.println(args[i]);
		}
	}
}
