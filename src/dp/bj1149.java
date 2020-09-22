package rudghks373;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj1149 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int dp[][] = new int[N + 1][3];
		int a[][] = new int[N + 1][3];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dp[0][0] = a[0][0];
		dp[0][1] = a[0][1];
		dp[0][2] = a[0][2];
		for (int i = 1; i <= N; i++) {
			dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + a[i][0];
			dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + a[i][1];
			dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + a[i][2];
		}

		bw.write(String.valueOf(Math.min(dp[N][2], Math.min(dp[N][0], dp[N][1]))));
		bw.flush();
		bw.close();
		br.close();
	}
}
