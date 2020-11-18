// 20-11-18 거스름돈 1000원을 냈을때 거슬러줄 동전 개수 구하기(500, 100, 10, 1 원짜리가 있다)
package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class money {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 동전의 총 개수
		int answer = 0;
		
		// 지불해야 하는 금액(1 ~ 999) 입력
		int n = 1000 - Integer.parseInt(br.readLine());
		
		
		if(n >= 500) {
			answer += n / 500;
			n = n % 500;
		}
		if(n >= 100) {
			answer += n / 100;
			n = n % 100;
		}
		if(n >= 50) {
			answer += n / 50;
			n = n % 50;
		}
		if(n >= 10) {
			answer += n / 10;
			n = n % 10;
		}
		if(n >= 5) {
			answer += n / 5;
			n = n % 5;
		}
		if(n >= 1) {
			answer += n / 1;
		}
		
		System.out.println(answer);

	}

}
