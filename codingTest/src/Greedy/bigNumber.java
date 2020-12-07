package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
// 20-12-07 큰 수 구하기 프로그래머스 탐욕법
public class bigNumber {
	
	
	static class Solution {
	    public String solution(String number, int k) {
	    	StringBuilder sb = new StringBuilder();
	        String answer = "";
	        int index = 0;
	        char max = '0';
	        ArrayList<Character> array = new ArrayList<Character>();
	        
	        for(int i = 0; i < number.length(); i++) {
	        	array.add(number.charAt(i));
	        }
	        
	        // i = 정해진 숫자 개수, index = 탐색을 시작할 숫자, k + 1개중 가장 큰 수를 answer에 추가
	        for(int i = 0; i < array.size() - k; i++) {
	        	max = '0';
	        	for(int j = index; j <= k + i; j++) {
	        		if(max < array.get(j)) {
	        			max = array.get(j);
	        			index = j + 1;
	        		}
	        	}
	        	sb.append(max);
	        }
	        answer = sb.toString();
	        return answer;
	    }
	}
	

	public static void main(String[] args) {
		Solution s = new Solution();
		String number = "4177252841";
		System.out.println(s.solution(number, 4));
		

	}

}
