package rudghks373.backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj15652 {

	static BufferedWriter bw;
	static int N;
	static int M;
	static int arr[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[10];
		br.close();
		
		sol(0);
		bw.close();

	}

	public static void sol(int k) throws IOException {
		if (k == M) {
			if (check()) {
				for (int i = 0; i < M; i++) {
					bw.write(arr[i] + " ");
				}
				bw.newLine();
				return;
			}
		} else {
			for (int i = 1; i <= N; i++) {
				arr[k] = i;
				sol(k + 1);
			}
		}
	}

	public static boolean check() {
		for (int i = 0; i < M - 1; i++) {
			if (arr[i + 1] < arr[i])
				return false;
		}
		return true;
	}
}
