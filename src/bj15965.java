package rudghks373;

import java.util.Scanner;

public class bj15965 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long a[] = new long[7500000];
		int count = 0;
		sc.close();

		for (int i = 2; i < a.length; i++) {
			a[i] = i;
		}

		for (int i = 2; i < a.length; i++) {
			if (a[i] == 0)
				continue;

			for (int j = i * 2; j < a.length; j += i) {
				a[j] = 0;
			}
		}

		for(int i = 2; i < a.length; i++) {
			if (a[i] != 0) count++;
			if (count == num) {
				System.out.println(a[i]);
				break;
			}
		}
		
		
	}
}
