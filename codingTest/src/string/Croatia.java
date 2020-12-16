// 20-12-09 크로아티아 알파벳 백준 2941 도전 중
package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Croatia {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String alphabet = br.readLine();
		
		int answer = 0;
		int len = alphabet.length() - 1;
		
		for(int i = 0; i < alphabet.length(); i++) {
			char c = alphabet.charAt(i);
			
			if(c == 'c' && i < len) {
				if(alphabet.charAt(i + 1) == '-') i++;
				else if(alphabet.charAt(i + 1) == '=') i++; 
			}
			
			else if(c == 'd' && i < len) {
				
				if(alphabet.charAt(i + 1) == 'z' && i < len -1) 
					if(alphabet.charAt(i + 2) == '=') i += 2;
					
				else if(alphabet.charAt(i + 1) == '-') i++;			
			}
				
			else if(c == 'l' && i < len) {
				if(alphabet.charAt(i + 1) == 'j') i++;			
			}
				
			else if(c == 'n' && i < len) {		
				if(alphabet.charAt(i + 1) == 'j') i++;		
			}
			
			else if((c == 's' || c == 'z') && i < len) {
				if(alphabet.charAt(i + 1) == '=') i++;
			}
				
			answer++;
		}
		
		System.out.println(answer);
	
	}

}
