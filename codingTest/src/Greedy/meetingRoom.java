// 회의실 배정하기 20-11-18
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
			k[i][0] = a;	// 시작시간
			k[i][1] = b;	// 종료시간
		}
		
		// 끝나는 시간 순으로 배열 정렬
		Arrays.sort(k, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					// 같을 경우 시작시간 오름차순으로 실행(내림차순의 경우 시작과 종료가 같은 경우 에러)
					return o1[0] - o2[0];
				}
				else {
					return o1[1] - o2[1];
				}
			}
			
		});
		
		// 회의시간의 중복여부를 확인 할 최근 회의의 종료시간
		int max = k[0][1];
		
		// 회의가 중복되지 않는 회의가능한 숫자
		for(int i = 1; i < n; i++) {
			if(max <= k[i][0]) {
				count++;
				max = k[i][1];
			}
		}
		
		System.out.println(count);
		

	}

}