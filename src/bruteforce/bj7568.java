package rudghks373.bruteforce;

import java.util.Scanner;

public class bj7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int leng = sc.nextInt();
		int people[][] = new int[leng + 1][leng + 1];
		for (int i = 1; i < leng + 1; i++) {
			int weight = sc.nextInt();
			int height = sc.nextInt();
			people[i][0] = weight; // ¹«°Ô
			people[i][1] = height; // Å°
			people[i][2] = 1;
		}
		sc.close();

		for (int i = 1; i < leng + 1; i++) {
			for (int j = i + 1; j < leng + 1; j++) {
				if (people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
					people[i][2]++;
				}

				else if (people[i][0] > people[j][0] && people[i][1] > people[j][1]) {
					people[j][2]++;
				}

			}
		}

		for (int i = 1; i < leng + 1; i++) {
			System.out.print(people[i][2] + " ");
		}

	}
}
