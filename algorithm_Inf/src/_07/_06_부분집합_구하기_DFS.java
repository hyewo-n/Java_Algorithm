package _07;

/*
 * 	�ڿ��� N�� �־����� 1���� N������ ���Ҹ� ���� ������ �κ������� ��� ����ϴ� ���α׷��� �ۼ��ϼ���
 * 	�������� ������� �ɴ´�
 * 	- �Է¿��� : 3
 * 	- ��¿��� : 1 2 3 / 1 2 / 1 3 / 1 / 2 3 / 2 / 3 
 */

public class _06_�κ�����_���ϱ�_DFS {

	static int n;
	// check �迭. �� ���ڸ� �κ��������� ����Ѵ� ���Ѵ�
	static int ch[];
	
	public static void DFS(int L) {
		if(L==n+1) {
			String tmp = "";
			for(int i=1; i<=n; i++) {
				if(ch[i]==1)tmp += (i + " ");
			}
			if(tmp.length() > 0)
				System.out.println(tmp);
		}else {
			ch[L]=1;   // check �迭(����Ѵ�)
			DFS(L+1);  // ����(����Ѵ�)
			ch[L]=0;   // check �迭(�����Ѵ�)
			DFS(L+1);  // ������(�����Ѵ�)
		}
	}
	
	public static void main(String[] args) {
		
		n = 3;
		ch = new int[n+1];   // �ε��� ��ȣ�� ���ҷ� ����
		DFS(1);
	}

}
