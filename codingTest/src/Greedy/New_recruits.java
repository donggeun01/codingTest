// 20-11-22 ���� ���(���� �� ���� ��� �ΰ��� ���� �и��� �ʴ� ��� �̱�)
// �ð�  �ʰ� ����
package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class New_recruits {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < t; i++) {

			int n = Integer.parseInt(br.readLine());
			int count = 1;
			int[][] list = new int[n][2];
			
			for(int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				list[j][0] = Integer.parseInt(st.nextToken());
				list[j][1] = Integer.parseInt(st.nextToken());
			}
			
			// ���� �� ����
			Arrays.sort(list, new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0] - o2[0];
				}
			});
			
			// �������� ��� �ְ����� ���� ����� �������� ����
			int check = list[0][1];
			
			// ���� ������ ����� �ڽź��� ���� �̵�� ���� ��� ��
			for(int j = 1; j < list.length; j++) {
				// �ڽź��� ���� �������� ����� ������ �ִ� �̵� �� ���� ���� ���� ������ ��
				if(check > list[j][1]) {
					count++;
					check = list[j][1];
				}
				else if (check == list[j][1]) {
					count++;
				}
			}
			
			sb.append(count).append("\n");
		}
		
		System.out.println(sb);
	}	

}


