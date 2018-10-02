
public class Media {
	public static void main(String[] args) { //args: 4 5 6 7 8 9 10
		int i = 0;
		double s = 0;
		for( String arg: args){
			i++;
			s += Double.parseDouble(arg);
		}
		System.out.println("media: " + s/i);
	}
}
