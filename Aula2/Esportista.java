import java.util.ArrayList;

public class Esportista extends Pessoa{
	
	public Esportista(String name, int idade, double peso) {
		super(name, idade, peso);
		this.esportes = new ArrayList<>();
	}
	private ArrayList<String> esportes;
	private int horasDePraticaDiaria;
	
	public int getHorasDePraticaDiaria() {
		return horasDePraticaDiaria;
	}
	public void setHorasDePraticaDiaria(int horasDePraticaDiaria) {
		this.horasDePraticaDiaria = horasDePraticaDiaria;
	}
	public ArrayList<String> getEsporte() {
		return esportes;
	}
	public void addEsporte(String esporte) {
		this.esportes.add(esporte);
	}
	
	public String toString() {
		return super.toString() + "\nEsportes praticados: " + this.getEsporte() + "\nHoras de pratica diaria: " + this.horasDePraticaDiaria;
	}
}
