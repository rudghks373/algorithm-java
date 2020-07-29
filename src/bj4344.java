package rudghks373;

import java.util.Scanner;

public class bj4344 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int totalCount = sc.nextInt();
		
		
		for (int i = 0; i < totalCount; i++) {
			int count = sc.nextInt();
			int arr[] = new int[count];
			int avgCount = 0;
			int sum = 0;
		

			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}

			int avg = (sum / count);
			for (int k = 0; k < arr.length; k++) {
				if (arr[k] > avg) {
					avgCount++;
				}
			}

			System.out.printf("%.3f", 100.0 * avgCount / count);
			System.out.println("%");

		}
		sc.close();
	}
}
