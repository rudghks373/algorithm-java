package rudghks373;

import java.util.Scanner;

public class bj2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int degree = 1;
		int checkNum = 1;
		sc.close();

		while (true) {

			if (checkNum >= num) {
				break;
			} else {
				checkNum += (6 * degree);
				degree++;
			}

		}

		System.out.println(degree);
	}
}
