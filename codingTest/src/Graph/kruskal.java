// 20-11-04 (크루스칼 알고리즘)
package Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class kruskal {
	
	public static int getParent(int parent[], int a) {
		
		if(parent[a] == a) return a;
		
		return parent[a] = getParent(parent, parent[a]);
	}
	
	
	public static void union_Find(int parent[], int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		
		if(a < b) parent[b] = a;
		else parent[a] = b;
	}
	
	public static boolean FindParent (int parent[], int a , int b) {
		
		a = getParent(parent, a);
		b = getParent(parent, b);
		
		if (a == b) return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		int n = 8;
		kruskal k = new kruskal();
		ArrayList<Edge> list = new ArrayList<Edge>();
		
		list.add(new Edge(1,7,12));
		list.add(new Edge(1,4,28));
		list.add(new Edge(1,2,67));
		list.add(new Edge(1,5,17));
		list.add(new Edge(2,4,24));
		list.add(new Edge(2,5,62));
		list.add(new Edge(3,5,20));
		list.add(new Edge(3,6,37));
		list.add(new Edge(4,7,13));
		list.add(new Edge(5,6,45));
		list.add(new Edge(5,7,73));
		
		list.sort(new AscendingObj());
		
		// 노드 위치 초기화
		int[] set = new int[n];
		for(int i = 0; i < n; i++) {
			set[i] = i; 
		}
		
		// 비용 초기화
		int sum = 0;
		
		for (int i = 0; i < list.size(); i++) {
			if(!FindParent(set, list.get(i).node[0], list.get(i).node[1])) {
				sum += list.get(i).distance;
				union_Find(set, list.get(i).node[0], list.get(i).node[1]);
			}
		}
		
		
		System.out.println(sum);

	}

}

class Edge{
	int[] node = new int[2];
	int distance;

	  
	Edge(int a, int b, int distance) {
		node[0] = a;
		node[1] = b;
		this.distance = distance;
	}
	
	
}

class AscendingObj implements Comparator<Edge> {
	@Override
	public int compare(Edge e1, Edge e2) {
		if(e1.distance > e2.distance) return 1;
		if (e1.distance < e2.distance) return -1;
		return 0;
	}
}




