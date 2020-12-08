// 20-12-09 단어 공부 백준 1157 번
package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;

public class wordStudy {

	public static void main(String[] args) throws IOException{
		int[] n = new int[26];
		int max = -1;
		char t = '0';
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().toLowerCase();
		
		for(byte bt : str.getBytes()) {
			n[bt - 'a'] += 1; 
		}
		
		for (int i = 0; i < n.length; i++) {
			if(n[i] > max) {
				max = n[i];
				t = (char)('A' + i);
			}
			else if(max == n[i]){
				t = '?';
			}
		}
		
		System.out.println(t);
		
	}

}
