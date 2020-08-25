package rudghks373.dfsBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj14888 {
	static int arr[];
	static int operator[];
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static int nCount;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		nCount = Integer.parseInt(br.readLine());

		arr = new int[nCount];
		operator = new int[4];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < nCount; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < 4; i++) {
			operator[i] = Integer.parseInt(st.nextToken());
		}
		sol(1, arr[0], operator, -1);
		System.out.println(max);
		System.out.println(min);

	}

	public static void sol(int k, int sum, int[] op, int cnt) {
		if (k == nCount) {
			max = Math.max(max, sum);
			min = Math.min(min, sum);
			return;
		} else {

			int[] cop = new int[4];
			for (int i = 0; i < 4; i++) {
				cop[i] = op[i];
			}

			if (cnt != -1) {
				cop[cnt]--;
			}

			int result = 0;

			if (cop[0] > 0) {
				result = sum + arr[k];
				sol(k + 1, result, cop, 0);
			}
			if (cop[1] > 0) {
				result = sum - arr[k];
				sol(k + 1, result, cop, 1);
			}
			if (cop[2] > 0) {
				result = sum * arr[k];
				sol(k + 1, result, cop, 2);
			}
			if (cop[3] > 0) {
				result = sum / arr[k];
				sol(k + 1, result, cop, 3);
			}

		}

	}
}
