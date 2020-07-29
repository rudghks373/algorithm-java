package rudghks373;

import java.util.Scanner;

public class bj1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		if (b >= c) {
			System.out.println(-1);
		} else {
			int count = a / (c - b) + 1;
			System.out.println(count);
		}

	}

}
