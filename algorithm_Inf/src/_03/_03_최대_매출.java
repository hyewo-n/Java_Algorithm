package _03;
import java.util.*;

public class _03_�ִ�_���� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		} // �Է� �Ϸ�
		
		int answer=0;
		int sum=0;
		
		// �ϴ� ó�� sum�� ���� ���� ����ؼ� ����
		for(int i=0; i<k; i++) {
			sum += arr[i];
			answer = sum; //answer �ʱ�ȭ
		}
		
		for(int i=k; i<n; i++)
		{
			// �� ĭ�� �и鼭 �� ���̱� ������
			// �� ���� �迭 ���� �� ���� �ſ��� �ϳ� ������
			sum = sum + arr[i] - arr[i-k];
			answer = Math.max(answer, sum);
		}
		System.out.println(answer);
	}
}