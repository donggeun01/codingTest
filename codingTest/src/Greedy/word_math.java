// 20-11-25 단어 수학
package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class word_math {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int answer = 0;
		int n = Integer.parseInt(br.readLine());
		Integer alpha[] = new Integer[26];
		
		for(int i = 0; i < alpha.length; i++) {
			alpha[i] = 0;
		}
		
		
		for(int i = 0; i < n; i++) {
			char[] array = br.readLine().toCharArray();
			int pow = (int)Math.pow(10, array.length - 1);
			
			for(int j = 0; j < array.length; j++) {
				alpha[array[j] - 'A'] += pow;
				pow = pow / 10;
			}
		}
		
		Arrays.sort(alpha, Collections.reverseOrder());
		
		for(int i = 0; i < 10; i++) {
			answer += alpha[i] * (9 - i);
		}
		
		System.out.println(answer);
		
	}

}
