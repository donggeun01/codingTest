// ATM 사용 시간 구하기
package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0, temp = 0;
		int[] p = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			
			p[i] = a;
		}
		
		
		Arrays.sort(p);
		
		for (int i = 0; i < n; i++) {
			temp = temp + p[i];
			sum = sum + temp;
		}
		
		System.out.println(sum);

	}

}
