package rudghks373.recursion;

import java.util.Scanner;

public class bj1629 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		sc.close();
		System.out.println(sol(a, b, c));
		

	}

	public static long sol(long a, long b, long c) {
		if (b == 1) {
			return a % c;
		} else {
			long val = sol(a, b/2, c);
			val = val * val % c;
			if (b % 2 == 0) {
				return val;
			} else {
				return val * a % c;
			}
		}
	}
}
