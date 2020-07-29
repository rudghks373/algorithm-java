package rudghks373.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<Character>();
		String str = br.readLine();
		br.close();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				if (str.charAt(i - 1) == '(') {
					stack.pop();
					count += stack.size();
				} else {
					stack.pop();
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
