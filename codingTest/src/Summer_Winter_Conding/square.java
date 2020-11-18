package Summer_Winter_Conding;
// 20-11-01 멀쩡한 사각형 풀이
public class square {
	
	public long solution(int w, int h) {
        long answer = 1;
        long v = 1;
        long W = (long)w;
        long H = (long)h;
        
        // 유클리드 호제법을 이용한 최대공약수 구하기
        while (v > 0) {
        	v = W % H;
        	W = H;
        	H = v;
        }
        answer = ((long)w * (long)h) - ((long)w + (long)h - W);
        
        return answer;
    }
	 
	// 최대 공약수 구하기 (유클리드 호제법)
	public long gcd(int a, int b) {
		return (a==0)?b:gcd(b%a,a);
	}
	

	public static void main(String[] args) {
		square s = new square();
		int w = 8, h = 12;
		System.out.println(s.solution(w, h));

	}

}
