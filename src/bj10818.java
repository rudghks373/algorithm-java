package rudghks373;

import java.util.Scanner;

public class bj10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int arr[] = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		int min = 1000001;
		int max = -1000001;
		for (int i = 0; i < count; i++) {
			if (arr[i] < min)
				min = arr[i];
			if (arr[i] > max)
				max = arr[i];
		}

		System.out.println(min + " " + max);
	}
}
