package _02;
import java.util.*;

public class _01_ū_��_����ϱ� {

	public static void main(String[] args) {
		
		// ���� �׳� �迭�� �Ϸ��� �ߴµ� �׷��� �غ��� �߰��� 0 ���� ���°� �� ����
		// String answer�� �߰��Ϸ��� �ߴµ� string�̶� �׷��� ����
		// ArrayList ����� ��!
		// �ƴ�;; �׳� ���� �߸� �����ؼ� �׷��ſ���..,
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		answer.add(arr[0]);
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > arr[i-1])
				answer.add(arr[i]);
		}
		for(int x : answer)
			// println���� �̷���...
			System.out.print(x + " ");
	}

}
