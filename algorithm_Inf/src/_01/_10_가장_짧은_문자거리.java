package _01;
import java.util.*;

public class _10_����_ª��_���ڰŸ� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		int[] answer = new int[str.length()];
		
		// ���ڿ��� ���̰� 100�� ���� �ʴ´ٰ� ������ �׺��� ū ���ڷ� ����
		int p = 1000;
		
		// ù ��° for��. �տ�������
		for(int i=0; i<str.length(); i++) {
			// �Է��� ���ڿ� ������ p=0���� �ٲ���
			if(str.charAt(i)==c) {
				p=0;
				answer[i]=p;
			}
			// �Է��� ���ڿ� ���� ������ 1�� ����
			else {
				p++;
				answer[i]=p;
			}
		}
		// ������ 
		// 1001 0 1 2 3 0 1 2 3 4 0 
		
		p=1000;
		
		// �� ��° for�� (�ڿ�������)
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i)==c) {
				p=0;
			}
			else {
				p++;
				answer[i]=Math.min(answer[i], p);
				// ���� ������ ���� ��쿡�� ���� �ٲ�.
			}
		}
		
		for(int j=0; j<answer.length; j++) {
			System.out.print(answer[j] + " ");			
		}	
	}
}
