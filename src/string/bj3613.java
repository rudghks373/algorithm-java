package rudghks373;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj3613 {
	static boolean c = false;
	static boolean java = false;
	static boolean check = true;
	static String val = null;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		val = br.readLine();
		// 첫번째 문자 대문자, 첫번째 마지막 언더바 일때 에러
		if (Character.isUpperCase(val.charAt(0)) || '_' == val.charAt(val.length() - 1) || '_' == val.charAt(0)) {
			check = false;
		} else {
			for (int i = 1; i < val.length(); i++) {
				// 언더바 2개 이상일때 에러
				if (val.charAt(i) == '_') {
					if (val.charAt(i - 1) == '_' || java ) {
						check = false;
					}
					c = true;
					// 대문자와 _ 같이 있을때 에러
				} else if (Character.isUpperCase(val.charAt(i))) {
					if (c) {
						check = false;
					} else {
						java = true;
					}
				} 
			}
		}
		
		if (!check) {
			bw.write("Error!");
		} else {
			if (java) {
				javaTrans();
				bw.write(val);
			} else if (c) {
				cTran();
				bw.write(val);
			} else {
				bw.write(val);
			}
		}

		bw.flush();
	}

	public static void javaTrans() {
		for (int i = 0; i < val.length(); i++) {
			if (Character.isUpperCase(val.charAt(i))) {
				char under = '_';
				char temp = val.charAt(i);
				temp += 32;
				val = val.substring(0, i) + under + temp + val.substring(i + 1, val.length());
			}
		}
	}

	public static void cTran() {
		for (int i = 0; i < val.length(); i++) {
			if ('_' == val.charAt(i)) {
				char temp = val.charAt(i + 1);
				temp -= 32;
				val = val.substring(0, i) + temp + val.substring(i + 2, val.length());
			}

		}
	}
}
