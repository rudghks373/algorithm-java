package rudghks373;

import java.util.Scanner;

public class bj2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		sc.close();

		while (true) {
			if (a % 5 == 0) {
				System.out.println(a / 5 + count);
				break;
			} else if (a / 3 > 0) {
				a -= 3;
				count++;
			} else {
				System.out.println(-1);
				break;
			}

		}
	}
}
