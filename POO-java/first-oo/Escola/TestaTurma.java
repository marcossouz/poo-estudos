package Escola;

public class TestaTurma {
	public static void main(String[] args) {
		
		Turma t1 = new Turma();
		t1.periodo = 4;
		t1.serie = 2;
		t1.sigla = "A";
		t1.tipoDeEnsino = "Padrao";
		
		Turma t2 = new Turma();
		t2.periodo = 6;
		t2.serie = 3;
		t2.sigla = "B";
		t2.tipoDeEnsino = "Tecnico";
		
		System.out.println("Dados turma 1");
		System.out.println("Perido: " + t1.periodo);
		System.out.println("Serie: " + t1.serie);
		System.out.println("Sigla: " + t1.sigla );
		System.out.println("tipo de ensino: " + t1.tipoDeEnsino);
		
		System.out.println("------------------------------------");
		
		System.out.println("Dados Turma 2");
		System.out.println("Perido: " + t2.periodo);
		System.out.println("Serie: " + t2.serie);
		System.out.println("Sigla: " + t2.sigla );
		System.out.println("tipo de ensino: " + t2.tipoDeEnsino);
	}
}
