// ACM È£ÅÚ
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
			
			int h = Integer.parseInt(st.nextToken()); // ³ôÀÌ
			int w = Integer.parseInt(st.nextToken()); // ³ÐÀÌ
			int n = Integer.parseInt(st.nextToken()); // n¹ø¤Š ¼Õ´Ô
			
			
			if(n % h == 0) sb.append((h * 100) + n / h + "\n");
			
			else sb.append(((n % h) * 100) + (n / h + 1) + "\n");
		}
		
		System.out.println(sb);

	}

}
