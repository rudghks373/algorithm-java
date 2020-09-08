package rudghks373.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj1931 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int answer = 0;
		int min = -1;
		int[][] times = new int[N][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			times[i][0] = Integer.parseInt(st.nextToken());
			times[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(times, (a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);

		for (int i = 0; i < N; i++) {
			if (times[i][0] >= min) {
				min = times[i][1];
				answer++;
			}
		}

		bw.write(Integer.toString(answer));
		bw.flush();
	}

}
