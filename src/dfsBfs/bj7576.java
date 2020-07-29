package rudghks373.dfsBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj7576 {
	private static int arr[][];
	private static int check[][];
	private static int dist[][];
	private static int dx[] = { 0, -1, 0, 1 };
	private static int dy[] = { -1, 0, 1, 0 };
	private static int n, m;
	private static Queue<int[]> queue = new LinkedList<int[]>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		check = new int[n][m];
		dist = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				int temp = Integer.parseInt(st.nextToken());
				arr[i][j] = temp;
				check[i][j] = 0;
				if (temp == 1)
					queue.offer(new int[] { i, j });
				if (temp == 0)
					dist[i][j] = -1;
			}
		}
		br.close();

		bfs();
		System.out.println(sol());

	}

	public static int sol() {
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (dist[i][j] == -1) {
					max = -1;
					return max;
				} else {
					max = Math.max(max, dist[i][j]);
				}
			}
		}
		return max;
	}

	public static void bfs() {
		while (!queue.isEmpty()) {
			int v[] = queue.poll();
			int vx = v[0];
			int vy = v[1];
			for (int i = 0; i < 4; i++) {
				int nx = vx + dx[i];
				int ny = vy + dy[i];
				if (nx >= 0 && ny >= 0 && nx < n && ny < m && arr[nx][ny] != -1 && check[nx][ny] == 0 && dist[nx][ny] < 0) {
					check[nx][ny] = 1;
					queue.offer(new int[] { nx, ny });
					dist[nx][ny] = dist[vx][vy] + 1;
				}
			}
		}
	}
}
