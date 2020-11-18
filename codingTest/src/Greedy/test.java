package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class test {

	public static void main(String[] args) {
		int[][] arr = {{7,15}, {0,2}, {5,10}};
		
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[1] - o1[1];
			}
		});
		
		for (int i = 0; i < arr[0].length; i++) {
			System.out.println(arr[0][i]);
		}

	}
}
