package Summer_Winter_Conding;
// 20-11-01 암호해독 풀이 미완(런타임 에러)
public class decryption {
	
	
	public String solution(String encrypted_text, String key, int rotation) {
        String answer = "";
        String s = encrypted_text.substring(rotation) + encrypted_text.substring(0,rotation);
        char[] en = s.toCharArray();
        char[] keys = key.toCharArray();
        
        for(int i = 0; i < en.length; i++) {
        	int k = en[i];
        	switch(keys[i]) {
            case 'a':
            	k = k- 1;
            	en[i] = (char)k;
            	break;
            case 'b':
            	k = k- 2;
            	en[i] = (char)k;
            	break;
            case 'c':
            	k = k- 2;
            	en[i] = (char)k;
            	break;
            case 'd':
            	k = k- 3;
            	en[i] = (char)k;
            	break;
            case 'e':
            	k = k- 4;
            	en[i] = (char)k;
            	break;
            case 'f':
            	k = k- 5;
            	en[i] = (char)k;
            	break;
            case 'g':
            	k = k- 6;
            	en[i] = (char)k;
            	break;	
            case 'h':
            	k = k- 7;
            	en[i] = (char)k;
            	break;
            case 'i':
            	k = k- 8;
            	en[i] = (char)k;
            	break;
            case 'j':
            	k = k- 9;
            	en[i] = (char)k;
            	break;
            case 'k':
            	k = k- 10;
            	en[i] = (char)k;
            	break;
            case 'l':
            	k = k- 11;
            	en[i] = (char)k;
            	break;	
            case 'm':
            	k = k- 12;
            	en[i] = (char)k;
            	break;	
            case 'n':
            	k = k- 13;
            	en[i] = (char)k;
            	break;	
            case 'o':
            	k = k- 14;
            	en[i] = (char)k;
            	break;	
            case 'p':
            	k = k- 15;
            	en[i] = (char)k;
            	break;	
            case 'q':
            	k = k- 16;
            	en[i] = (char)k;
            	break;	
            case 'r':
            	k = k- 17;
            	en[i] = (char)k;
            	break;	
            case 's':
            	k = k- 18;
            	en[i] = (char)k;
            	break;	
            case 't':
            	k = k- 19;
            	en[i] = (char)k;
            	break;	
            case 'u':
            	k = k- 20;
            	en[i] = (char)k;
            	break;	
            case 'v':
            	k = k- 21;
            	en[i] = (char)k;
            	break;	
            case 'w':
            	k = k- 22;
            	en[i] = (char)k;
            	break;	
            case 'x':
            	k = k- 23;
            	en[i] = (char)k;
            	break;	
            case 'y':
            	k = k- 24;
            	en[i] = (char)k;
            	break;	
            case 'z':
            	k = k- 25;
            	en[i] = (char)k;
            	break;	
            }
            
            if(k < 97) {
            	k = 122 - (97- k);
            	en[i] = (char)k;
            }
        }
        
        
        answer = new String(en);
        
        System.out.println(answer);
       
        return answer;
    }

	public static void main(String[] args) {
		decryption c = new decryption();
		String encrypted_text = "qyyigoptvfb";
		String key = "abcdefghijk";
		char a = 'a'; 
		int k = a;
		k = k + 1;
		a = (char)k;
		System.out.println(a);
		int rotation = 3;
		c.solution(encrypted_text, key, rotation);

	}

}
