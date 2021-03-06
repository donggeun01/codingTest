// ACM 호텔
package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class hotel {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int h = Integer.parseInt(st.nextToken()); // 높이
			int w = Integer.parseInt(st.nextToken()); // 넓이
			int n = Integer.parseInt(st.nextToken()); // n번쨰 손님
			
			
			if(n % h == 0) sb.append((h * 100) + n / h + "\n");
			
			else sb.append(((n % h) * 100) + (n / h + 1) + "\n");
		}
		
		System.out.println(sb);

	}

}
