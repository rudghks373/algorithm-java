package rudghks373.backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj15650 {

	static int N;
	static int M;
	static int arr[];
	static int check[];
	static BufferedWriter bw;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[10];
		check = new int[10];
		br.close();

		sol(0 , 1);
		bw.flush();
		bw.close();

	}

	public static void sol(int k, int start) throws IOException {
		if (k == M) {
			for (int i = 0; i < M; i++) {
				bw.write(arr[i] + " ");
			}
			bw.newLine();
			return;
		} else {
			for (int i = start; i <= N; i++) {
				if (!(check[i] == 1)) {
					check[i] = 1;
					arr[k] = i;
					sol(k + 1 , i);
					check[i] = 0;
				}
			}
		}

	}
}
