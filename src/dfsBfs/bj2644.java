package rudghks373.dfsBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj2644 {

	static ArrayList<Integer>[] graph;
	static int dist[];
	static boolean check[];
	static int anwser = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int hum1 = Integer.parseInt(st.nextToken());
		int hum2 = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		dist = new int[n + 1];
		check = new boolean[n + 1];
		graph = (ArrayList<Integer>[]) new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<Integer>();
			dist[i] = 0;
			check[i] = false;
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph[x].add(y);
			graph[y].add(x);
		}
		br.close();

		bfs(hum1);
		if(dist[hum2] == 0)
			System.out.println("-1");
		else
			System.out.println(dist[hum2]);
	}

	public static void bfs(int hum1) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(hum1);
		check[hum1] = true;
		while (!queue.isEmpty()) {
			int current = queue.poll();
			for (int next : graph[current]) {
				if (check[next] == false) {
					dist[next] = dist[current] + 1;
					check[next] = true;
					queue.offer(next);
				}
			}
		}
	}
}
