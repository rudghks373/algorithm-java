package rudghks373;

import java.util.ArrayList;
import java.util.Scanner;

public class bj2606 {

	static int InfectedComputerCount;
	static ArrayList<Integer>[] graph;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int computerNum = sc.nextInt();

		graph = new ArrayList[computerNum + 1];
		boolean check[] = new boolean[computerNum + 1];
		for (int i = 1; i < computerNum + 1; i++) {
			graph[i] = new ArrayList<Integer>();
		}

		int connectComputerCount = sc.nextInt();
		for (int i = 0; i < connectComputerCount; i++) {
			int f = sc.nextInt();
			int b = sc.nextInt();
			graph[f].add(b);
			graph[b].add(f);
		}
		sc.close();
		dfs(check, 1);
		System.out.println(InfectedComputerCount-1);
	}

	public static void dfs(boolean check[], int n) {
		if (check[n]) {
			return;
		} else {
			check[n] = true;
			InfectedComputerCount++;
			for (int i = 0; i < graph[n].size(); i++) {
				int temp = graph[n].get(i);
				if (check[temp] == false) {
					dfs(check, temp);
				}
			}
		}
	}
}
