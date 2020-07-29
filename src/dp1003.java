package rudghks373;

import java.util.Scanner;

public class dp1003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int arr[][] = new int[41][2];
		int num;

		arr[0][0] = 1;
		arr[1][1] = 1;

		for (int i = 2; i < 41; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i - 2][j];
			}
		}

		for (int k = 0; k < count; k++) {
			num = sc.nextInt();
			System.out.println("num:" + num + " 0:" + arr[num][0] + " 1:" + arr[num][1]);
		}
		
		sc.close();
	}

}
