package rudghks373.recursion;

import java.util.Scanner;

public class bj17478 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.close();
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		sol(0, count);
	}

	public static void sol(int num, int count) {

		String underBar = "";
		String str[] = new String[6];
		str[0] = "\"재귀함수가 뭔가요?\"";
		str[1] = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
		str[2] = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
		str[3] = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
		str[4] = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
		str[5] = "라고 답변하였지.";

		if (num >= 1) {
			underBar = "____";
			for (int i = 1; i < num; i++) {
				underBar += "____";
			}
		}

		if (num < 1) {
			System.out.println(str[0]);
			System.out.println(str[1]);
			System.out.println(str[2]);
			System.out.println(str[3]);
		}
		if (num >= 1 && num < count) {
			System.out.println(underBar + str[0]);
			System.out.println(underBar + str[1]);
			System.out.println(underBar + str[2]);
			System.out.println(underBar + str[3]);
		}
		if (num == count) {
			System.out.println(underBar + str[0]);
			System.out.println(underBar + str[4]);
			System.out.println(underBar + str[5]);
			return;
		}
		sol(num + 1, count);
		System.out.println(underBar + str[5]);
	}
}
