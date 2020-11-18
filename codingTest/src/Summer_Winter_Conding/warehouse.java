package Summer_Winter_Conding;
// 20-11-01 창고재고 확인 (완)
public class warehouse {
	
	
	public String solution(int n, int[][] delivery) {
        int[] d = new int[n + 1];
        String answer = "";
        
        // 1 은 재고 2은 재고없음 3은 알수없음
        // 재고가 남은 물건 목록 등록
        for(int i = 0; i < delivery.length; i++) {
            if (delivery[i][2] == 1) {
                d[delivery[i][0]] = 1;
                d[delivery[i][1]] = 1;
            }
        }
        
       
        
        
        // 재고가 안남은 물건
        for(int i = 0; i < delivery.length; i++) {
            if(delivery[i][2] == 0) {
                if(d[delivery[i][0]] == 1) {
                    d[delivery[i][1]] = 2;
                }
                if(d[delivery[i][1]] == 1) {
                    d[delivery[i][0]] = 2;
                }
            }
        }
        
        
        
        // 알수없는 물건
        for(int i = 0; i < d.length; i++) {
            if (d[i] != 1 && d[i] != 2) {
                d[i] = 3;
            } 
        }
        
        
        for (int i = 1; i < d.length; i++) {
            if (d[i] == 1) {
                answer = answer + "0";
            }
            else if (d[i] == 2) {
                answer = answer + "X";
            }
            else if(d[i] == 3) {
                answer = answer + "?";
            }
        }
        
        return answer;
    }
	

	public static void main(String[] args) {
		int n = 6;
		int[][] delivery = {{1,3,1},{3,5,0},{5,4,0},{2,5,0}};
		
		warehouse c = new warehouse();
		System.out.println(c.solution(n, delivery));

	}

}
