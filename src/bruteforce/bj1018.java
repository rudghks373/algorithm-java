package rudghks373.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj1018 {
	static char[][] W = new char[8][8];
	static char[][] B = new char[8][8];
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char arr[][] = new char[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j = 0; j < m; j++) {
				arr[i][j] = line.charAt(j);
			}
		}
		br.close();
		int min = Integer.MAX_VALUE; 
		build();
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < m ; j++) {
				if (i + 8 <= n && j + 8 <= m) {
					min = Math.min(min, check(arr, i, j));
				}
				
			}
		}
		
		System.out.println(min);

	}

	public static void build() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i % 2 == 0 || j % 2 == 0) && (i % 2 != 0 || j % 2 != 0)) {
					W[i][j] = 'W';
				} else {
					W[i][j] = 'B';
				}
			}
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i % 2 == 0 || j % 2 == 0) && (i % 2 != 0 || j % 2 != 0)) {
					B[i][j] = 'B';
				} else {
					B[i][j] = 'W';
				}
			}
		}

	}
	
	static int check(char[][] arr, int x, int y) {
		int minW = 0;
		int minB = 0;

		// W 체크
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (arr[i + x][j + y] != W[i][j]) {
					minW++;
				}
			}
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (arr[i + x][j + y] != B[i][j]) {
					minB++;
				}
			}
		}

		// 두 가지 경우에서 더 작은 값을 리턴
		return Math.min(minW, minB);
	}
}
