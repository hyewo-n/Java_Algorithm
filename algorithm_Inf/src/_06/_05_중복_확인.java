package _06;
import java.util.*;

public class _05_�ߺ�_Ȯ�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}  // �Է� �Ϸ�
		
		String answer = "U";
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {   // �׻� j�� ���� ���� ���� ��������
				if(arr[i] == arr[j])
					answer = "D";
			}
		}
		System.out.println(answer);
	}

}
