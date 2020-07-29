package rudghks373.dfsBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj2178 {
	private static int arr[][];
	private static int check[][];
	private static int dist[][];
	private static int dx[] = { 0, -1, 0, 1 };
	private static int dy[] = { -1, 0, 1, 0 };
	private static int n, m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		check = new int[n][m];
		dist = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j = 0; j < m; j++) {
				arr[i][j] = line.charAt(j) - '0';
				check[i][j] = 0;
				dist[i][j] = 0;
			}
		}
		br.close();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (check[i][j] == 0 && arr[i][j] == 1) {
					dist[i][j] = 1;
					check[i][j] = 1;
					bfs(i, j);
				}
			}
		}

		System.out.println(dist[n - 1][m - 1]);
	}

	public static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(new int[] { x, y });
		while (!queue.isEmpty()) {
			int v[] = queue.poll();
			int vx = v[0];
			int vy = v[1];
			for (int i = 0; i < 4; i++) {
				int nx = vx + dx[i];
				int ny = vy + dy[i];
				if (nx >= 0 && ny >= 0 && nx < n && ny < m && arr[nx][ny] == 1 && check[nx][ny] == 0) {
					check[nx][ny] = 1;
					queue.offer(new int[] { nx, ny });
					dist[nx][ny] = dist[vx][vy] + 1;
				}
			}
		}

	}

}
