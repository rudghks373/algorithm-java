package rudghks373;

import java.util.Scanner;

public class bj10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println(sol(num));

	}

	public static int sol(int n) {
		if (n <= 1) {
			return n;
		} else {
			return sol(n - 1) + sol(n - 2);
		}
	}
}
