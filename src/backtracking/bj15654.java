package rudghks373.backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj15654 {

	static BufferedWriter bw;
	static int N;
	static int M;
	static int arr[];
	static int nArr[];
	static int check[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		check = new int[10];
		nArr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			nArr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nArr);
		sol(0);
		br.close();
		bw.close();

	}

	public static void sol(int k) throws IOException {
		if (k == M) {
			for (int i = 0; i < M; i++) {
				bw.write(arr[i] + " ");
			}
			bw.newLine();
		} else {
			for (int i = 0; i < N; i++) {
				if (!(check[i] == 1)) {
					check[i] = 1;
					arr[k] = nArr[i];
					sol(k+1);
					check[i] = 0;
				}
			}
		}
	}
}