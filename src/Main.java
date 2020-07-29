package rudghks373;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int arr[] = new int[count];

		for (int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();

		Arrays.sort(arr);
		
		int min = arr[0];
		
		for (int i = 1; i < count; i++) {
		arr[i] = arr[i-1] + arr[i];
		min += arr[i];
		}
		
		System.out.println(min);
		
	}

}