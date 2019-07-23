
public class VidSpeedup {

	public static void main(String[] args) {
		Kattio inScanner = new Kattio(System.in, System.out);
		
		int n = inScanner.getInt();
		int p = inScanner.getInt();
		int k = inScanner.getInt();
		double[] segs = new double[n + 1];
		double[] times = new double[n + 1];
		int lastStamp = 0;
		
		for(int i = 0; i < n; i++) {
			int thisStamp = inScanner.getInt();
			times[i] = thisStamp - lastStamp;
			lastStamp = thisStamp;
		}
		times[n] = k - lastStamp;
		
		for(int seg = 0; seg < n + 1; seg++) {
			segs[seg] = ((double)(100 + seg*p)) / 100.0 * times[seg];
		}
		
		double total = 0.0;
		for(int i = 0; i < n + 1; i++) {
			total += segs[i];
		}
			
		System.out.println(total);
		inScanner.close();
	}

}
