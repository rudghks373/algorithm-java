package rudghks373;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj9095dp {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int DP[] = new int[11];

		DP[1] = 1;
		DP[2] = 2;
		DP[3] = 4;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int goal = Integer.parseInt(st.nextToken());

			for (int j = 4; j <= goal; j++) {
				DP[j] = DP[j - 1] + DP[j - 2] + DP[j - 3];
			}
			System.out.println(DP[goal]);
		}
	}
}
