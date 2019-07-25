
public class thanos_the_hero {

	public static void main(String[] args) {
		Kattio inScanner = new Kattio(System.in, System.out);
		int N = inScanner.getInt();
		long [] worlds = new long[N];
		for(int i = 0; i < N; i++) {
			worlds[i] = inScanner.getInt();
		}
		long total = 0;
		for(int i = N - 2; i >= 0; i--) {
			if(worlds[i] >= worlds[i + 1]) {
				total += worlds[i] - (worlds[i+1] - 1);
				worlds[i] = worlds[i+1] - 1;
				if(worlds[i] < 0) {
					total = 1;
					break;
				}
			}
		}
		System.out.println(total);
		inScanner.close();
	}

}
