package _07;

/*
 * 	자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요
 * 	공집합은 출력하지 앉는다
 * 	- 입력예제 : 3
 * 	- 출력예제 : 1 2 3 / 1 2 / 1 3 / 1 / 2 3 / 2 / 3 
 */

public class _06_부분집합_구하기_DFS {

	static int n;
	// check 배열. 이 수자를 부분집합으로 사용한다 안한다
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
			ch[L]=1;   // check 배열(사용한다)
			DFS(L+1);  // 왼쪽(사용한다)
			ch[L]=0;   // check 배열(사용안한다)
			DFS(L+1);  // 오른쪽(사용안한다)
		}
	}
	
	public static void main(String[] args) {
		
		n = 3;
		ch = new int[n+1];   // 인덱스 번호를 원소로 생각
		DFS(1);
	}

}
