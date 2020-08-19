package rudghks373.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj9663 {
	static int cnt = 0;
	static int N;
	static boolean isused1[];
	static boolean isused2[];
	static boolean isused3[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		br.close();
		isused1 = new boolean[40];
		isused2 = new boolean[40];
		isused3 = new boolean[40];
		sol(0);
		System.out.println(cnt);
	}

	public static void sol(int k) {
		if (k == N) {
			cnt++;
			return;
		} else {
			for (int i = 0; i < N; i++) {
				if (isused1[i] || isused2[i + k] || isused3[k - i + N - 1]) {
					continue;
				}
				isused1[i] = true;
				isused2[i + k] = true;
				isused3[k - i + N - 1] = true;
				sol(k + 1);
				isused1[i] = false;
				isused2[i + k] = false;
				isused3[k - i + N - 1] = false;

			}
		}
	}
}
