package rudghks373.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class bj4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String str = br.readLine();
			boolean check = true;
			Stack<Character> stack = new Stack<Character>();
			if (".".equals(str)) {
				break;
			}

			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (c == '(' || c == '[') {
					stack.push(c);
				} else if (c == ')' )
					if (stack.empty() || stack.peek() != '(') {
						check = false;
					} else {
						stack.pop();
					}
				else if (c == ']' ) {
					if (stack.empty() || stack.peek() != '[') {
						check = false;
					} else {
						stack.pop();
					}
				}
			}
			if (stack.empty() && check == true) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}

		br.close();

	}
}
