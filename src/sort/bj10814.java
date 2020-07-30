package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class bj10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String arr[][] = new String[n][2]; 
		for(int i = 0; i < n; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			String age = st.nextToken();
			String name = st.nextToken();
			arr[i][0] = age;
			arr[i][1] = name;
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
		});
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<arr.length;i++) {
			bw.write(arr[i][0] + " " + arr[i][1] + "\n");
		}
		bw.close();
	}
}
