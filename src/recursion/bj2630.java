package rudghks373.recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj2630 {
	static int arr[][];
	static int white = 0;
	static int blue = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());

		arr = new int[N][N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		br.close();
		
		sol(N, 0, 0);
		bw.write(white + "\n");
		bw.write(blue + "\n");
		bw.close();

	}

	public static void sol(int size, int x, int y) {
		if (checkArr(size, x, y)) {
			if (arr[x][y] == 0)
				white++;
			else
				blue++;
		} else {
			sol(size / 2, x, y);
			sol(size / 2, x + size / 2, y);
			sol(size / 2, x, y + size / 2);
			sol(size / 2, x + size / 2, y + size / 2);
		}
	}

	public static boolean checkArr(int size, int x, int y) {
		int check = arr[x][y];
		for (int i = x; i < x+size; i++) {
			for (int j = y; j < y+size; j++) {
				if (check != arr[i][j]) {
					return false;
				}
			}
		}
		return true;

	}
}
