package rudghks373;

import java.util.Scanner;

public class bj2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		int num = (v - b - 1) / (a-b)  +1;
		sc.close();
		
		System.out.println(num);
		
	}
}
