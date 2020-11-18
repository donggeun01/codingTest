// 동전 계산하기
package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class coin {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int answer = 0;
		
		ArrayList<Integer> coinArray = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine());
			
			coinArray.add(a);
		}
		
		
		for(int i = coinArray.size() - 1; i >= 0; i--) {
			int a = coinArray.get(i);
			answer = answer + (k / a);
			
			k = k % a;
		}
		
		System.out.println(answer);
		

	}

}
