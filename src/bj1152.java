package rudghks373;

import java.util.Scanner;

public class bj1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int count = 0;
		if (str.length() != 0) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ')
					count++;
			}
			if (str.charAt(0) == ' ')
				count--;
			if (str.charAt(str.length() - 1) != ' ')
				count++;
		}
		System.out.println(count);
	}
}