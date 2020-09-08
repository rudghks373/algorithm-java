package rudghks373.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj1541 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		br.close();
		String[] minus = str.split("\\-");
		int answer = plusAdd(minus[0]);

		for (int i = 1; i < minus.length; i++) {
			answer -= plusAdd(minus[i]);
		}

		bw.write(Integer.toString(answer));
		bw.flush();
	}

	public static int plusAdd(String str) {
		String[] arr = str.split("\\+");
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += Integer.parseInt(arr[i]);
		}

		return result;

	}
}
