// ���ͽ�Ʈ�� �˰��� ���� 20-10-31
package Graph;

public class Dijkstra {
	
	static int INF = 1000000000;
	static int number = 6;
	
	// ������ weight
	static int[][] edge = new int[number][number];
	
	// �ִ� ���
	static int[] d = new int[number];
	
	// �湮���
	static boolean[] v = new boolean[number];
	
	// �湮���� ���� ����� ���� ����� ���Ե�� ���
	public int getSmallIndex() {
		int min = INF;
		int index = 0;
		for(int i = 0; i < number; i++) {
			if(d[i] < min && !v[i]) {
				min = d[i];
				index = i;
			}
		}
		return index;
	}
	
	public void dijkstra(int start) {
		for(int i = 0; i < number; i++) {
			d[i] = edge[start][i];
		}
		v[start] = true;
		for(int i = 0; i < number -2; i++) {
			int current = getSmallIndex();
			v[current] = true;
			for(int j = 0; j < 6; j++) {
				if(!v[j]) {
					if(d[current] + edge[current][j] < d[j]) {
						d[j] =  d[current] + edge[current][j];
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		

	}

}
