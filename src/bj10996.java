package rudghks373;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj10996 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		br.close();

		if (N == 1) {
			bw.write("*");
		} else {
			for (int i = 0; i < N * 2; i++) {
				for (int j = 0; j < N; j++) {
					if (i % 2 == 0) {
						if (j % 2 != 0) {
							bw.write(" ");
						}
						if (j % 2 == 0) {
							bw.write("*");
						}
					}

					if (i % 2 != 0) {
						if (j % 2 != 0) {
							bw.write("*");
						}
						if (j % 2 == 0) {
							bw.write(" ");
						}
					}

				}
				bw.newLine();
			}
		}
		bw.flush();

	}
}
