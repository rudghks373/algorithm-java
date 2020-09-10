package rudghks373.backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj14889 {
	static int arr[][];
	static int N;
	static boolean check[];
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		check = new boolean[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		br.close();
		sol(0,0);
		bw.write(Integer.toString(min));
		bw.flush();
		
	}

	public static void sol(int idx, int count) {
		if(min ==0) {
			return;
		}
		
		if (count == N / 2) {
			diff();
			return;
		}

		for (int i = idx; i < N; i++) {
			if (!check[i]) {
				check[i] = true;
				sol(i + 1, count + 1);
				check[i] = false;
			}
		}
	}

	public static void diff() {
		int team_start = 0;
		int team_link = 0;

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (check[i] == true && check[j] == true) {
					team_start += arr[i][j];
					team_start += arr[j][i];
				} else if (check[i] == false && check[j] == false) {
					team_link += arr[i][j];
					team_link += arr[j][i];
				}
			}
		}

		int diff = Math.abs(team_start - team_link);

		min = Math.min(diff, min);
	}

}
