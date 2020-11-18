package Summer_Winter_Conding;
// 20-11-01 ������ �簢�� Ǯ��
public class square {
	
	public long solution(int w, int h) {
        long answer = 1;
        long v = 1;
        long W = (long)w;
        long H = (long)h;
        
        // ��Ŭ���� ȣ������ �̿��� �ִ����� ���ϱ�
        while (v > 0) {
        	v = W % H;
        	W = H;
        	H = v;
        }
        answer = ((long)w * (long)h) - ((long)w + (long)h - W);
        
        return answer;
    }
	 
	// �ִ� ����� ���ϱ� (��Ŭ���� ȣ����)
	public long gcd(int a, int b) {
		return (a==0)?b:gcd(b%a,a);
	}
	

	public static void main(String[] args) {
		square s = new square();
		int w = 8, h = 12;
		System.out.println(s.solution(w, h));

	}

}
