package rudghks373.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj1182 {
	static int N;
	static int S;
	static int cnt = 0;
	static int arr[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		sol(0, 0);
		if (S == 0)
			cnt--;
		System.out.println(cnt);
	}

	public static void sol(int idx, int sum) {
		if (idx == N) {
			if (sum == S) {
				cnt++;
			}
			return;
		}
		sol(idx + 1, sum);
		sol(idx + 1, sum + arr[idx]);
	}
}
