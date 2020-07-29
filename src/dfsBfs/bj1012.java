package rudghks373.dfsBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj1012 {
	static int m;
	static int n;
	static int arr[][];
	static int dx[] = { 0, -1, 0, 1 };
	static int dy[] = { -1, 0, 1, 0 };
	static Queue<int[]> queue = new LinkedList<int[]>();
	static int check[][];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = Integer.parseInt(st.nextToken());

		for (int i = 0; i < count; i++) {
			int anwser = 0;
			st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			int kk = Integer.parseInt(st.nextToken());
			arr = new int[m][n];
			check = new int[m][n];
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < n; k++) {
					arr[j][k] = 0;
					check[j][k] = 0;
				}
			}

			for (int j = 0; j < kk; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				arr[x][y] = 1;
			}

			for (int j = 0; j < m; j++) {
				for (int k = 0; k < n; k++) {
					if (arr[j][k] == 1 && check[j][k] == 0) {
						check[j][k] = 1;
						bfs(j, k);
						anwser++;
					}
				}
			}
			System.out.println(anwser);
		}
		
	}

	public static void bfs(int j, int k) {
		queue.offer(new int[] { j, k });
		while (!queue.isEmpty()) {
			int vx[] = queue.poll();
			int nx = vx[0];
			int ny = vx[1];
			for (int h = 0; h < 4; h++) {
				int hx = nx + dx[h];
				int hy = ny + dy[h];
				if (hx >= 0 && hy >= 0 && hx < m && hy < n && check[hx][hy] == 0 && arr[hx][hy] == 1) {
					queue.offer(new int[] { hx, hy });
					check[hx][hy] = 1;
				}
			}
		}

	}
}
