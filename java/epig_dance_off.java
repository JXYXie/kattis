import java.io.IOException;

public class epig_dance_off {

	public static void main(String[] args) throws IOException {
		Kattio inScanner = new Kattio(System.in, System.out);
		
		String[] nums = inScanner.r.readLine().split(" ");
		int N = Integer.parseInt(nums[0]);
		int M = Integer.parseInt(nums[1]);
		char[][] dance = new char[N][M];

		for(int row = 0; row < N; row++) {
			dance[row] = inScanner.r.readLine().toCharArray();
		}
		
		int moves = 1;
		for(int col = 0; col < M; col++) {
			boolean isNewMove = true;
			for(int row = 0; row < N && isNewMove; row++) {
				if(dance[row][col] == '$') {
					isNewMove = false;
				}
			}
			if(isNewMove) {
				moves++;
			}
		}
		
		System.out.println(moves);
		inScanner.close();
	}

}
