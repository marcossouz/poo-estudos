package Escola;

public class TestaAluno {
	public static void main(String[] args) {
		
		Aluno alu1 = new Aluno();
		alu1.nome = "Marcos";
		alu1.RG = 32504;
		alu1.nasc = "14/10/2001";
		
		Aluno alu2 = new Aluno();
		alu2.nome = "Elly";
		alu2.RG = 123456;
		alu2.nasc = "16/06/1991";
		
		System.out.println("Dados do Aluno 1");
		System.out.println("Nome: " + alu1.nome);
		System.out.println("RG: " + alu1.RG);
		System.out.println("Nasc: " + alu1.nasc);
		
		System.out.println("-------------------------");
		
		System.out.println("Dados do aluno 2");
		System.out.println("Nome: " + alu2.nome);
		System.out.println("RG: " + alu2.RG);
		System.out.println("Nasc: " + alu2.nasc);
		
		
		
	}
}
