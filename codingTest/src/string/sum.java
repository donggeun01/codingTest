// 20-12-08 숫자의 합 백준 1170번
package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sum {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		int n = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < n; i++) {
			sum += br.read() - 48;
		}
		
		
		System.out.println(sum);
	}

}
