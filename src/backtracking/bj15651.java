package rudghks373.backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj15651 {

	static int N;
	static int M;
	static int arr[];
	static BufferedWriter bw;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[9];
		br.close();
		sol(0);
		bw.close();
	}

	public static void sol(int k) throws IOException {
		if (k == M) {
			for (int i = 0; i < M; i++) {
				bw.write(arr[i] + " ");
			}
			bw.newLine();
		} else {
			for (int i = 1; i <= N; i++) {
				arr[k] = i;
				sol(k + 1);
			}
		}
	}
}
