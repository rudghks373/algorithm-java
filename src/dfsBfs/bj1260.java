package rudghks373.dfsBfs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj1260 {
	static ArrayList<Integer>[] graph;
	static boolean[] visit_dfs;
	static boolean[] visit_bfs;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int numN = sc.nextInt(); // 정점의 갯수
		int numM = sc.nextInt();// 간선의 갯수
		int numV = sc.nextInt();// 시작 정점의 번호
		graph = (ArrayList<Integer>[]) new ArrayList[numN + 1];
		visit_dfs = new boolean[numN + 1];
		visit_bfs = new boolean[numN + 1];
		for (int i = 1; i <= numN; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < numM; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			graph[u].add(v);
			graph[v].add(u);
		}

		for (int i = 1; i <= numN; i++) {
			Collections.sort(graph[i]);
		}

		sc.close();

		dfs(visit_dfs, numV);
		System.out.println("");
		bfs(visit_bfs, numV);

	}

	public static void dfs(boolean[] visit_dfs, int numV) {
		if (visit_dfs[numV]) {
			return;
		}
		visit_dfs[numV] = true;
		System.out.print(numV + " ");
        for (int y : graph[numV]) {
            if (visit_dfs[y] == false) {
                dfs(visit_dfs, y);
            }
        }
	}

	public static void bfs(boolean[] visit_bfs, int numV) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(numV);
		visit_bfs[numV] = true;
		while (!q.isEmpty()) {
			int x = q.remove();
			System.out.print(x + " ");
            for (int y : graph[x]) {
                if (visit_bfs[y] == false) {
                	visit_bfs[y] = true;
                    q.add(y);
                }
            }
		}
	}

}
