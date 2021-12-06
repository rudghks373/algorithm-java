package rudghks373.dp;

import java.util.Scanner;

public class bj1912 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();

		int arr[] = new int[count + 1];
		int dp[] = new int[count + 1];
		for (int i = 1; i < count+1; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();
		dp[1] = arr[1];
		int max = arr[1];
		for (int j = 2; j < arr.length; j++) {
			dp[j] = Math.max(arr[j], dp[j - 1] + arr[j]);
			if(dp[j] > max) {
				max = dp[j];
			}
		}

		System.out.println(max);

	}

}
