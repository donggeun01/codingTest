// 20-12-08 문자열 반복 백준 2675번
package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class stringRepeat {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			for(char ch : st.nextToken().toCharArray()) {
				for(int j = 0; j < n; j++) {
					sb.append(ch);
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
		
	}

}
