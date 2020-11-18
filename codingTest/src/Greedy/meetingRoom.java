// ȸ�ǽ� �����ϱ� 20-11-18
package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class meetingRoom {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 1;
		int n = Integer.parseInt(br.readLine());
		int[][] k = new int[n][2];
		
		for (int i =0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			k[i][0] = a;	// ���۽ð�
			k[i][1] = b;	// ����ð�
		}
		
		// ������ �ð� ������ �迭 ����
		Arrays.sort(k, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					// ���� ��� ���۽ð� ������������ ����(���������� ��� ���۰� ���ᰡ ���� ��� ����)
					return o1[0] - o2[0];
				}
				else {
					return o1[1] - o2[1];
				}
			}
			
		});
		
		// ȸ�ǽð��� �ߺ����θ� Ȯ�� �� �ֱ� ȸ���� ����ð�
		int max = k[0][1];
		
		// ȸ�ǰ� �ߺ����� �ʴ� ȸ�ǰ����� ����
		for(int i = 1; i < n; i++) {
			if(max <= k[i][0]) {
				count++;
				max = k[i][1];
			}
		}
		
		System.out.println(count);
		

	}

}