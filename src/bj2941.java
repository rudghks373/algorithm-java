package rudghks373;

import java.util.Scanner;

public class bj2941 {
	public static void main(String[] args) {
		String croStr[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		Scanner sc = new Scanner(System.in);
		String checkStr = sc.nextLine();
		sc.close();
		for (int i = 0; i < croStr.length; i++) {
			checkStr = checkStr.replace(croStr[i], "T");
		}
		System.out.println(checkStr.length());
	}
}
