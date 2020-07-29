package rudghks373;

import java.util.Scanner;

public class bj2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseCount = sc.nextInt();

		for (int i = 0; i < caseCount; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(sol(k, n));
		}
		sc.close();

	}

	private static int sol(int k, int n) {
		if (k == 0)
			return n;
		else if (n == 1)
			return 1;
		else
			return sol(k - 1, n) + sol(k, n - 1);
	}
}
