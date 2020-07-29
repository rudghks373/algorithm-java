package rudghks373;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class bj11729 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		BigInteger count = new BigInteger("2");
		bw.write(count.pow(num).subtract(BigInteger.ONE) + "\n");
		if (num <= 20) {
			hanoi(num, '1', '2', '3');
		}
		bw.close();

	}

	public static void hanoi(int n, char from, char middle, char to) throws IOException {

		if (n == 1) {
			bw.write(from + " " + to + "\n");
		} else {
			hanoi(n - 1, from, to, middle);
			bw.write(from + " " + to + "\n");
			hanoi(n - 1, middle, from, to);
		}
	}

}
