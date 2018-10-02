import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class TestaAdicionaNoFinal {
	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList();
		
//		long tempo = TestaAdicionaNoFinal.adicionaNoFinal(arrayList);
//		System.out.println("ArrayList: " + tempo + "ms");
		
		long tempo = TestaAdicionaNoFinal.adicionaNoFinal(linkedList);
		System.out.println("LinkedList: " + tempo + "ms");
	}
	
	public static long adicionaNoFinal(LinkedList lista){
		long inicio = System.currentTimeMillis();
		
		int size = 100000;
		
		for(int i = 0; i < size; i++){
			lista.add(i);
		}
		
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
	}
}
