// 20-12-16 그룹단어 체크 백준 1316번
package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class groupWord_check {

	// N개의 입력을 받아 그룹단어 개수를 출력하시오.
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		char[][] list = new char[n][];
		int[] word = new int[26];
		int count = n;
		
		for(int i = 0; i < word.length; i++) {
			word[i] = 0;
		}
		
		for(int i = 0; i < n; i++) {
			list[i] = br.readLine().toCharArray();
		}
		
		for(int i = 0; i < list.length; i++) {
			char ch = list[i][0];
			word[ch - 'a'] = 1;
			for(int j = 0; j < list[i].length; j++) {
				if(ch != list[i][j]) {
					if(word[list[i][j] - 'a'] == 1) {
						count--;
						
						break;
					}
					else {
						word[list[i][j] - 'a'] = 1;
						ch = list[i][j];
					}
				}
			}
			
			for(int k = 0; k < word.length; k++) {
				word[k] = 0;
			}
		}
		
		System.out.println(count);

	}

}
