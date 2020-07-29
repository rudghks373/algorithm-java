package rudghks373.bruteforce;

import java.util.Scanner;

public class bj2231 {
	public static void main(String[] args) {
		
		final int MAX_VALUE = 1000000;
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= MAX_VALUE; i++) {
			int number = i;
			int creatorNumber = 0;
			creatorNumber += number;
			
			while(number != 0) {
				int restN = number % 10;
				creatorNumber += restN;
				number /= 10;
			}
			
			if(creatorNumber == num) {
				System.out.println(i);
				break;
			}
			if(i == MAX_VALUE) {
				System.out.println(0);
				break;
			}
		
		}
		
	}
}
