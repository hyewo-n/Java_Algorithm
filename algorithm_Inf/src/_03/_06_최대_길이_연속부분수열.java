package _03;
import java.util.*;

public class _06_�ִ�_����_���Ӻκм��� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		} // �Է� �Ϸ�
		
		// �Ȱ��� ������Ʈ �˰��� ���
		// �տ��� rt�� ���鼭 0�� 1�� �ٲٰ� ����
		// �ڿ��� lt�� ���󰡸鼭 �� 1�� �ٽ� 0���� �ٲ���
	
		int answer=0; 
		//cnt�� rt�� 0�� 1�� �ٲ� Ƚ��
		int cnt=0; 
		int lt =0;
		for(int rt=0; rt<n; rt++) {
			// rt�� 0�� ������ cnt ����
			if(arr[rt]==0)
				cnt++;
			while(cnt>k) {  // ���� ������ �ִ񰪺��� cnt�� Ŀ����
				if(arr[lt]==0)  // lt�� ���󰡼� �ٽ� 0���� �ٲٰ�
					cnt--;     // cnt �� ���ҽ�����
				lt++;
			}
			
			// �迭 ���� ���
			answer = Math.max(answer,  rt-lt+1);
		}
		System.out.println(answer);
		
	}

}
