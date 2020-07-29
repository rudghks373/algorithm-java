package rudghks373.dfsBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj1926 {
	private static int visit[][];
	private static int arr[][];
	private static int n, m;
	private static int dx[] = { 0, -1, 0, 1 };
	private static int dy[] = { -1, 0, 1, 0 };
	private static int area;

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		visit = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				visit[i][j] = 0;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 1 && visit[i][j] == 0) {
					area = 1;
					visit[i][j] = 1;
					bfs(i, j);
					answer.add(area);
				}
			}
		}
		int max = 0;
		int size = answer.size();

		for (int i = 0; i < size; i++) {
			max = Math.max(max, answer.get(i));
		}

		System.out.println(size);
		System.out.println(max);

		br.close();

	}

	public static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(new int[] { x, y });
		while (!queue.isEmpty()) {
			int[] temp = queue.poll();
			int row = temp[0];
			int col = temp[1];
			for (int i = 0; i < 4; i++) {
				int nx = row + dx[i];
				int ny = col + dy[i];
				if (nx >= 0 && ny >= 0 && nx < n && ny < m && visit[nx][ny] == 0 && arr[nx][ny] == 1) {
					visit[nx][ny] = 1;
					queue.offer(new int[] { nx, ny });
					area++;
				}
			}
		}
	}
}
