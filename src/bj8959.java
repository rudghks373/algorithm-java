package rudghks373;

import java.util.Scanner;

public class bj8959 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String arr[] = new String[count];
		for (int i = 0; i < count; i++) {
			arr[i] = sc.next();
		}
		sc.close();
		for (int i = 0; i < count; i++) {
			int sum = 0;
			int score = 1;
			for (int j = 0; j < arr[i].length(); j++) {
				char charAt = arr[i].charAt(j);
				if ('O' == charAt) {
					sum += score;
					score++;
				} else {
					score = 1;
				}
			}
			System.out.println(sum);
		}
	}
	
}
