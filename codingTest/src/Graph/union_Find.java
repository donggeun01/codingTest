package Graph;
// 20-11-04 union-Find(������ �˰���)
public class union_Find {
	
	// �θ� ��� Ž��
	public static int getParent(int[] parent, int a) {
		if (parent[a] == a) return a;
		return parent[a] = getParent(parent, parent[a]);
	}
	
	// �θ� ��� ��ġ��
	public static void union_Parent(int[] parent, int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		
		if(a < b) parent[b] = a;
		else parent[a] = b;
	}
	
	// �θ�����  ���Ῡ�� Ȯ��
	public static String find_Parent (int parent[], int a, int b) {
		
		a = getParent(parent, a);
		b = getParent(parent, b);
		if(a == b) return "����Ǿ� �ֽ��ϴ�.";
		
		return "����Ǿ� ���� �ʽ��ϴ�.";
	}
	
	public static void main(String[] args) {
		
		int[] parent = new int[11];
		// �θ� ���� ���� �����ϰ� ����
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
		System.out.println("�θ� �� : " + getParent(parent, 1));
		System.out.println(find_Parent(parent, 1, 10));
		

	}

}
