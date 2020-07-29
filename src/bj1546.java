package rudghks373;

import java.util.Scanner;

public class bj1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float count = sc.nextInt();
		float arr[] = new float[(int) count];
		float max = 0;
		float sum = 0;
		for (int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] > max) {
				max = arr[i];
			}

		}
		sc.close();
		for (int i = 0; i < count; i++) {
			sum += arr[i] / max * 100;
		}

		System.out.println(sum / count);

	}
}
