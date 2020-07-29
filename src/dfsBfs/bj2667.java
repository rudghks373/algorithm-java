package rudghks373.dfsBfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj2667 {

	static int arr[][];
	static int count;
	static int size;
	static public int[][] visit;
	private static int[] dx = { 0, -1, 0, 1 };
	private static int[] dy = { -1, 0, 1, 0 };

	public static void main(String[] args) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		arr = new int[size][size];
		visit = new int[size][size];
		for (int i = 0; i < size; i++) {
			String str = sc.next();
			for (int j = 0; j < size; j++) {
				arr[i][j] = str.charAt(j) - '0';
				visit[i][j] = 0;
			}
		}
		sc.close();

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (arr[i][j] == 1 && visit[i][j] == 0) {
					count = 1;
					visit[i][j] = 1;
					bfs(i, j);
					answer.add(count);
				}
			}
		}

		Collections.sort(answer);

		System.out.println(answer.size());
		for (int i = 0; i < answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}

	public static void bfs(int x, int y) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(new Node(x, y));
		while (!queue.isEmpty()) {
			Node queueTemp = queue.poll();
			int row = queueTemp.row;
			int col = queueTemp.col;
			for (int k = 0; k < 4; k++) {
				int nx = row + dx[k];
				int ny = col + dy[k];
				if (nx >= 0 && ny >= 0 && nx < size && ny < size && arr[nx][ny] == 1 && visit[nx][ny] == 0) {
					visit[nx][ny] = 1;
					queue.offer(new Node(nx, ny));
					count++;
				}
			}
		}
	}
}

class Node {

	int row;
	int col;

	public Node(int row, int col) {
		this.row = row;
		this.col = col;
	}
}
