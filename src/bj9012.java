package rudghks373;

import java.util.Scanner;
import java.util.Stack;

public class bj9012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		StringBuilder answer = new StringBuilder();

		for (int j = 0; j < count; j++) {
			Stack<Character> stack = new Stack<Character>();
			boolean vps = true; 
			String st = sc.next();
			for (int k = 0; k < st.length(); k++) {
				char c = st.charAt(k);

				if (c == '(') {
					stack.push(c);
				} else if (c == ')') {
					if (stack.isEmpty()) {
						vps = false;
						break;
					}
					stack.pop();
				}
			}
			
            if(vps && stack.isEmpty()) {
            	answer.append("YES \n");
            }else {
            	answer.append("NO \n");
            }

			
		}
		sc.close();
		System.out.println(answer);
	}
}
