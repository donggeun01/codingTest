package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class snail_Up {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bp = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bp.readLine(), " ");
		
		// �ö� �Ÿ� a, �������� �Ÿ� b, ��ǥ�Ÿ� v
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int answer = (v - b - 1) / (a - b) + 1;
		System.out.println(answer);

	}

}
