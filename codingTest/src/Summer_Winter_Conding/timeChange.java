// 시간 변경하기
package Summer_Winter_Conding;
import java.util.ArrayList;

public class timeChange {
	
	
	static public class Solution {
	    public String solution(String p, int n) {
	        String answer = "";
	        
	        String ap = p.substring(0,2);
	        String hour = p.substring(3,5);
	        String m = p.substring(6,8);
	        String s = p.substring(9);
	       
	        
	        int h1 = Integer.parseInt(hour);
	        int m1 = Integer.parseInt(m);
	        int s1 = Integer.parseInt(s);
	        
	        if (ap.equals("PM")) h1 = h1 + 12;
	        
	        s1 = s1 + n;
	        System.out.println(h1);
	        System.out.println(m1);
	        System.out.println(s1);
	        
	        if (s1 >= 60) {
	            m1 = m1 + (s1 / 60);
	            s1 = s1 % 60;
	            if (m1 >= 60) {
	                h1 = h1 + (m1 / 60);
	                m1 = m1 % 60;
	            }
	        }
	        
	        
	        hour = Integer.toString(h1);
	        m = Integer.toString(m1);
	        s = Integer.toString(s1);
	        
	        if(hour.length() == 1) hour = "0"+hour;
	        if(m.length() == 1) m = "0"+m;
	        if(s.length() == 1) s = "0"+s;
	        answer = hour + ":" + m + ":"+ s;
	        
	        
	        return answer;
	    }
	}

	public static void main(String[] args) {
		
		Solution s = new Solution();
		System.out.print(s.solution("PM 01:00:00", 10));
	}

}
