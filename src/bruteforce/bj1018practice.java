package rudghks373.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj1018practice {
	static char W[][] = new char[8][8];
	static char B[][] = new char[8][8];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char arr[][] = new char[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			for (int j = 0; j < m; j++) {
				arr[i][j] = input.charAt(j);
			}
		}

		br.close();

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
					W[i][j] = 'W';
					B[i][j] = 'B';
				} else {
					W[i][j] = 'B';
					B[i][j] = 'W';
				}
			}
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i + 8 <= n && j + 8 <= m) {
					min = Math.min(min, sol(arr, i, j));
				}
			}
		}

		System.out.println(min);
	}

	public static int sol(char[][] arr, int x, int y) {
		int minW = 0;
		int minB = 0;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((arr[x + i][y + j]) != W[i][j]) {
					minW++;
				}
				if ((arr[x + i][y + j]) != B[i][j]) {
					minB++;
				}
			}
		}

		return Math.min(minW, minB);

	}

}
