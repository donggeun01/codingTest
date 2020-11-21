// 20-11-21 ������ �ߵ��� �ִ� �ִ� �߷� ���ϱ�

package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class rope {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ������ ����
		int n = Integer.parseInt(br.readLine());
		
		int[] k = new int[n];
		int answer = 0;
		
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine());
			
			k[i] = a;
		}
		
		Arrays.sort(k);
		
		// ���� ���� ��ƿ �� �ִ� �������� ���� �� ��ƿ �� �ִ� �߷� Ȯ��
		for(int i = 1; i <= n; i++) {
			int num = k[k.length - i];
			if (answer <= num * i) {
				answer = num * i;
			}
		}
		
		System.out.println(answer);
		
		
	}

}
