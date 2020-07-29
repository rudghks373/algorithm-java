package rudghks373;

import java.util.Scanner;

public class bj1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int sum = 0;
		int countNum = 0;

		while (sum < num) {
			countNum++;
			sum += countNum;
		}
		
		if (countNum % 2 == 0) {
			System.out.println((countNum - sum + num) + "/" + (sum - num + 1));
		} else {
			System.out.println((sum - num + 1) + "/" + (countNum - sum + num));
		} 

	}
}
