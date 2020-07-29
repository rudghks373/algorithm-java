package rudghks373;

import java.util.Scanner;

public class bj4796 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (true) {
			int numL = sc.nextInt(); // 연속가능사용일
			int numP = sc.nextInt(); // 캠핑장 이용일
			int numV = sc.nextInt(); // 휴가일
			if (numL == 0 && numP == 0 && numV == 0)
				break;

			int temp = numV % numP;
			count++;
			if (temp > numL)
				System.out.println("Case " + count + ": " + ((numV / numP) * numL + numL));
			else
				System.out.println("Case " + count + ": " + ((numV / numP) * numL + temp));
		}
		sc.close();

	}
}
