package rudghks373.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj1436 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int checkNum = 0;

		while (n > 0) {
			checkNum++;
			String str = Integer.toString(checkNum); 
			if (str.contains("666"))
				n--;
		}
		
		System.out.println(checkNum);
	}
}
