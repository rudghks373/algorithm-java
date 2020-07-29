package rudghks373;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj10989 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		int arr[] = new int[10001];

		for (int i = 0; i < count; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}

		for (int i = 0; i < 10001; i++) {
			if (arr[i] > 0) {
				for (int j = 0; j < arr[i]; j++) {
					bw.write(Integer.toString(i) + "\n");
				}
			}
		}

		br.close();
		bw.close();
	}

}
