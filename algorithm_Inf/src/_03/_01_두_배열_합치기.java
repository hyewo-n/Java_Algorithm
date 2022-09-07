package _03;
import java.util.*;

public class _01_두_배열_합치기 {
// 정렬을 사용할 수도 있지만 그렇게 하면 임팩트가 없습니다!
// 투 포인트 알고리즘으로 포인트 2개 잡아서 할 수 있냐를 물어보는 것!
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[] = new int[a];
		for(int i=0; i<a; i++) {
			arr[i] = sc.nextInt();
		}
		int b = sc.nextInt();
		int arr2[] = new int[b];
		for(int i=0; i<b; i++) {
			arr2[i] = sc.nextInt();
		}
		// 입력 완료
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		int p1=0, p2=0;
		while(p1<a && p2<b) {
			if(arr[p1] < arr2[p2])
				answer.add(arr[p1++]);
			else
				answer.add(arr2[p2++]);				
		}
		while(p1<a)
			answer.add(arr[p1++]);
		while(p2<b)
			answer.add(arr2[p2++]);		
		
		for(int x : answer)
			System.out.print(x + " ");
	}

}
