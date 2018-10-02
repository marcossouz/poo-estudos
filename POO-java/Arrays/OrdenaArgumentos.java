
public class OrdenaArgumentos {
	public static void main(String[] args) {
		java.util.Arrays.sort(args); //ordena o array
		
		for(String arg: args){
			System.out.println(arg);
		}
	}
}
