// 20-12-09 ��� ���� 2908��
package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class constant {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String answer = "";
		String num1 = st.nextToken();
		String num2 = st.nextToken();
		
		for(int i = num1.length() - 1; i >= 0; i--) {
			if(num1.charAt(i) != num2.charAt(i)) {
				answer = (num1.charAt(i) > num2.charAt(i)) ? num1 : num2;
				break;
			}	
		}
		
		for(int i = answer.length() - 1; i >= 0; i--) {
			System.out.print(answer.charAt(i));
		}
		
		
	}

}
