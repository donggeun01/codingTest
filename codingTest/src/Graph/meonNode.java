// 20-10-31 가장 먼 노드 (미완) 
package Graph;

public class meonNode {
	
	// 1번 노드에서 모든 노드로 가는 최단거리를 구하자
		// 1번 노드랑 연결된 노드 개수 적고
		// 연결된 노드에서 갈수 있는 노드 카운트
	
	// n = 노드개수, edge = 간선유무
	public int solution(int n, int[][] edge) {
		
		int[] a = new int[n+1];
		int k = 0;
        int answer = 0;
		boolean[] v = new boolean[n+1];
		int min = 1000000000;
		v[1] = true;
		
		for(int i = 0; i < a.length; i++) {
			a[i] = min;
		}
		
		// 1번 노드랑 연결된 노드
		for(int i = 0; i < edge.length; i++) {
			if(edge[i][0] == 1) {
				a[edge[i][1]] = 1;
			}
		}
		
		//for(int i = 0; i < a.length; i++) System.out.println(a[i]);
		
		for(int i = 0; i <= n; i++) {
			int current = getSmallIndex(a, v, a.length);
			v[current] = true;
			for(int j = 0; j < edge.length; j++) {
				if(!v[edge[j][1]]) {
					if(current == edge[j][0]) {
						if((a[current] +1) < a[edge[j][1]]) {
							a[edge[j][1]] = a[current] + 1;
						}
					}
				}
				if(!v[edge[j][0]]) {
					if(current == edge[j][1]) {
						if((a[current] +1) < a[edge[j][0]]) {
							a[edge[j][0]] = a[current] + 1;
						}
					}
				}
			}
			
		}
		
		// 가장 먼 노드 구하기
		for(int i = 0; i < a.length; i++) {
			if(a[i] == min) a[i] = 0;
			if (a[i] > k) {
				k = a[i];
			}
		}
		
		for(int i = 0; i < a.length; i++) System.out.println(a[i]);
		
		for(int i = 0; i < a.length; i++) {
			if(k == a[i]) {
				answer = answer + 1;
			}
		}
		
        return answer;
    }
	
	
	public int getSmallIndex(int a[], boolean[] v, int n) {
		
		int min = 1000000000;
		int index = 0;
		
		for(int i = 0; i < n; i++) {
			if(a[i] < min && !v[i]) {
				min = a[i];
				index = i;
			}
		}
		// System.out.println(index);
		return index;
	}
	
	

	public static void main(String[] args) {
		meonNode S = new meonNode();
		int n = 6;
		int[][] edge = {{3,6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}};
		System.out.println(S.solution(n, edge));

	}

}
