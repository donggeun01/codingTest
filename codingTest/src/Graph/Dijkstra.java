// 다익스트라 알고리즘 연습 20-10-31
package Graph;

public class Dijkstra {
	
	static int INF = 1000000000;
	static int number = 6;
	
	// 간선의 weight
	static int[][] edge = new int[number][number];
	
	// 최단 경로
	static int[] d = new int[number];
	
	// 방문기록
	static boolean[] v = new boolean[number];
	
	// 방문하지 않은 노드중 가장 비용이 적게드는 노드
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
