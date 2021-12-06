package rudghks373;

import java.util.Scanner;

public class bj5543 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i =0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int min = 2000;
		for(int j = 0; j<3; j++) {
			min = Math.min(min, arr[j]);
		}
		
		int min2 = 2000;
		for(int k = 3; k<5; k++) {
			min2 = Math.min(min2, arr[k]);
		}
		
		int answer = min+min2-50;
		
		System.out.println(answer);
		
	}
	
}
