package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class snail_Up {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bp = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bp.readLine(), " ");
		
		// 올라간 거리 a, 내려가는 거리 b, 목표거리 v
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int answer = (v - b - 1) / (a - b) + 1;
		System.out.println(answer);

	}

}
