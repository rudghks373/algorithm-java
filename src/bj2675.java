package rudghks373;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj2675 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = null;
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			int count = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			sb = new StringBuilder();
			for (int j = 0; j < str.length(); j++) {
				char tempChar = str.charAt(j);
				for (int k = 0; k < count; k++) {
					sb.append(tempChar);
				}
			}
			System.out.println(sb);
		}
	}
}
