// 20-11-22 ÀÒ¾î¹ö¸° °ýÈ£
package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bracket {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 10000000;
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		while(st.hasMoreTokens()) {
			StringTokenizer str = new StringTokenizer(st.nextToken(), "+");
			int n = 0;
			while(str.hasMoreTokens()) {			
				int k = Integer.parseInt(str.nextToken());
				n += k;
			}
			
			if (sum == 10000000) {
				sum = n;
			}
			else {
				sum -= n;
			}
			
		}
		System.out.println(sum);
		
	}

}
