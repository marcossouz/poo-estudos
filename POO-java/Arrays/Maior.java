
public class Maior {
	public static void main(String[] args) {
		
		double maior = 0;
		for(String arg: args){	// 4 7 23 5 1 9 4 12 24 21 3
			double s = Double.parseDouble(arg);
			if (s > maior) {
				maior = s;
			}
		}
		System.out.println("Maior Valor: " + maior);
	}
}
