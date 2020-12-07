// 20-12-08 ¾ËÆÄºª ½ºÄµ ¹éÁØ 10809¹ø
package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class alphabetScan {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] n = new int[26];
		int index = 0;
		
		for(int i = 0; i < n.length; i++) {
			n[i] = -1;
		}
		
		for(byte bt : br.readLine().getBytes()) {
			if(n[bt-'a'] == -1) {
				n[bt-'a'] = index;
			}
			index++;
		}
		
		for(int i : n) {
			sb.append(i).append(" ");
		}
		
		System.out.println(sb);
		
	}

}
