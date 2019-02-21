
public class Tests {
	public static void main(String args[]) {
		
		Pessoa joao = new Pessoa("Joao", 30, 80.12);
		Esportista renan = new Esportista("Renan", 25, 78.0);
		NaoEsportista joana = new NaoEsportista("Joana", 34, 54.0, "12/10/2016");
		
		renan.addEsporte("Boxer");
		renan.addEsporte("Futebol");
		renan.addEsporte("Corrida");
		renan.setHorasDePraticaDiaria(3);
		
		joana.setTipoUltimoTreino("Caminhada");
		
		System.out.println(joao.toString());
		System.out.println("----------------");
		System.out.println(renan.toString());
		System.out.println("----------------");
		System.out.println(joana.toString());
	}
}
