// 20-11-21 로프가 견딜수 있는 최대 중량 구하기

package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class rope {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 로프의 개수
		int n = Integer.parseInt(br.readLine());
		
		int[] k = new int[n];
		int answer = 0;
		
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine());
			
			k[i] = a;
		}
		
		Arrays.sort(k);
		
		// 가장 많이 버틸 수 있는 로프부터 연결 후 버틸 수 있는 중량 확인
		for(int i = 1; i <= n; i++) {
			int num = k[k.length - i];
			if (answer <= num * i) {
				answer = num * i;
			}
		}
		
		System.out.println(answer);
		
		
	}

}
