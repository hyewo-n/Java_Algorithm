package _06;
import java.util.*;

public class _05_�ߺ�_Ȯ��_����_���� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}  // �Է� �Ϸ�
		
		String answer = "U";
		
		// �������� ���� �� �پ��ִ� ���鳢�� ���Ͽ� ������ D ��ȯ
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++) {
			if(arr[i] == arr[i+1])
				answer = "D";
		}
		System.out.println(answer);
	}

}
