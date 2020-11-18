package Graph;
// 20-11-04 union-Find(합집합 알고리즘)
public class union_Find {
	
	// 부모 노드 탐색
	public static int getParent(int[] parent, int a) {
		if (parent[a] == a) return a;
		return parent[a] = getParent(parent, parent[a]);
	}
	
	// 부모 노드 합치기
	public static void union_Parent(int[] parent, int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		
		if(a < b) parent[b] = a;
		else parent[a] = b;
	}
	
	// 부모노드의  연결여부 확인
	public static String find_Parent (int parent[], int a, int b) {
		
		a = getParent(parent, a);
		b = getParent(parent, b);
		if(a == b) return "연결되어 있습니다.";
		
		return "연결되어 있지 않습니다.";
	}
	
	public static void main(String[] args) {
		
		int[] parent = new int[11];
		// 부모 노드와 값을 동일하게 설정
		for (int i = 1; i <= 10; i++) {
			parent[i] = i;
		}
		
		union_Parent(parent, 1, 2);
		union_Parent(parent, 2, 3);
		union_Parent(parent, 3, 4);
		union_Parent(parent, 5, 6);
		union_Parent(parent, 6, 7);
		union_Parent(parent, 8, 9);
		union_Parent(parent, 0, 10);
		
		System.out.println(find_Parent(parent, 1, 10));
		
		union_Parent(parent, 1, 10);
		System.out.println("부모 값 : " + getParent(parent, 1));
		System.out.println(find_Parent(parent, 1, 10));
		

	}

}
