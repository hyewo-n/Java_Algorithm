package _03;
import java.util.*;

public class _01_��_�迭_��ġ�� {
// ������ ����� ���� ������ �׷��� �ϸ� ����Ʈ�� �����ϴ�!
// �� ����Ʈ �˰������� ����Ʈ 2�� ��Ƽ� �� �� �ֳĸ� ����� ��!
	
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
		// �Է� �Ϸ�
		
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
