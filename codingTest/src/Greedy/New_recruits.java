// 20-11-22 신입 사원(서류 와 면접 등수 두가지 전부 밀리지 않는 사원 뽑기)
// 시간  초과 보류
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
			
			// 성적 순 정렬
			Arrays.sort(list, new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0] - o2[0];
				}
			});
			
			// 서류전형 등수 최고점을 받은 사람의 면접접수 저장
			int check = list[0][1];
			
			// 서류 전형의 등수가 자신보다 높은 이들과 면접 등수 비교
			for(int j = 1; j < list.length; j++) {
				// 자신보다 높은 서류전형 등수를 가지고 있는 이들 중 가장 높은 면접 접수와 비교
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


