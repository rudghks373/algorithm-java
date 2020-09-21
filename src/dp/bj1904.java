package rudghks373;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj1904 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		if (N == 0)
			System.out.println(0);
		else if (N == 1)
			System.out.println(1);
		else if (N == 2)
			System.out.println(2);
		else if (N >= 3) {
			long dp[] = new long[N + 1];
			dp[0] = 0;
			dp[1] = 1;
			dp[2] = 2;

			for (int i = 3; i <= N; i++) {
				dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
			}

			br.close();
			System.out.println(dp[N]);
		}
	}
}
