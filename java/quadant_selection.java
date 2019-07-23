
public class Quadrant {

	public static void main(String[] args) {
		Kattio inScanner = new Kattio(System.in, System.out);
		
		int x = inScanner.getInt();
		int y = inScanner.getInt();
		
		if(x > 0 && y > 0) {
			inScanner.write('1');
		} else if(x < 0 && y > 0) {
			inScanner.write('2');
		} else if( x > 0 && y < 0) {
			inScanner.write('4');
		} else {
			inScanner.write('3');
		}
		
		inScanner.close();
	}

}
