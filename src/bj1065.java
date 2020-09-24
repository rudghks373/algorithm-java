package rudghks373;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj1065 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int han = 0;
		int arr[] = new int[3];
		int N = Integer.parseInt(br.readLine());
		if (N >= 100) {
			han += 99;
			for (int i = 100; i <= N; i++) {
				arr[2] = i / 100; // 100의 자리
				arr[1] = (i / 10) % 10; // 10의 자리
				arr[0] = i % 10; // 1의 자리

				if ((arr[2] - arr[1]) == (arr[1] - arr[0])) {
					han++;
				}
			}
		} else if (N == 1000)
			return;
		else {
			han = N;
		}
		bw.write(String.valueOf(han));
		bw.flush();
		br.close();
	}
}
