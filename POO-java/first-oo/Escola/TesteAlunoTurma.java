package Escola;

public class TesteAlunoTurma {
	public static void main(String[] args) {
		Aluno a = new Aluno();
		Turma t = new Turma();
		
		t.periodo = 5;
		t.serie = 3;
		t.sigla = "B";
		t.tipoDeEnsino = "Padrao";
		
		a.nome = "Marcos Souza";
		a.RG = 12345;
		a.nasc = "20/12/1990";
		a.turma = t;
		
		System.out.println("Dados Turma e Aluno");
		
		System.out.println("Nome: " + a.nome);
		System.out.println("RG: " + a.RG);
		System.out.println("nasc: " + a.nasc);
		System.out.println("Periodo: " + t.periodo);
		System.out.println("Serie: " + t.serie);
		System.out.println("sigla: " + t.sigla);
		System.out.println("tipo de ensino: " + t.tipoDeEnsino);
		
	}
}
