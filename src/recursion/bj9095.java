package rudghks373.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj9095 {
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		int n = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int goal = Integer.parseInt(st.nextToken());
			System.out.println(sol(0, goal));
			
		}
	}

	public static int sol(int n, int goal) {

		if (n > goal)
			return 0;
		if (n == goal)
			return 1;
		int now = 0;
		for (int i = 1; i <= 3; i++) {
			now += sol(n + i, goal);

		}
		return now;

	}

}
