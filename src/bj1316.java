package rudghks373;

import java.util.Scanner;

public class bj1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for (int i = 0; i < num; i++) {
			String str = sc.next();
			boolean flag = true;

			for (int j = 0; j < str.length(); j++) {
				for (int k = 1; k < str.length(); k++) {
					if (str.charAt(k) != str.charAt(k - 1) && str.charAt(j) == str.charAt(k) && k > j) {
						flag = false;
						break;
					}
				}
				if (flag)
					count++;
			}
		}
		sc.close();

		System.out.println(count);

	}
}
