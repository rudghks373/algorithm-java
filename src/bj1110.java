package rudghks373;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj1110 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		br.close();

		int count = 0;
		int check = N;

		while (true) {

			int ten;
			int num;
			int temp;

			ten = check / 10;
			num = check % 10;
			temp = ten + num;

			check = (num * 10) + (temp % 10);
			count++;

			if (check == N) {
				break;
			}

		}

		bw.write(Integer.toString(count));
		bw.flush();
	}
}
