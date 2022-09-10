package _04;
import java.util.*;

public class _05_K��°_ū_�� {
/*
 * 	TreeSet�� �ߺ��� �����ϸ鼭 ���ı��� �ڵ����� ��
 * 	�����˻�Ʈ���� �ڷ� ����
 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		} // �Է� �Ϸ�
		
		int answer;
		// TreeSet�� �⺻������ ��������. ������������ �ҰŸ� reverseOrder() �־��ش�
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		
		// 3�� �̾Ƽ� ���� �Ŵϱ� 3�� for��(�̰� �����س���. ó�� ���� ������ �߸� ����)
		// ������ ���� �׳� n������ �ֵ� �ǳ�? �׳� �ֵ� ��. 
		// �ڿ� for������ �ᱹ ������ ���� �ʱ� ������ false ��
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int l=j+1; l<n; l++) {
					Tset.add(arr[i]+arr[j]+arr[l]);   // �� �߰� add��
				}
			}
		} // for�� ��

		int cnt=0;
		for(int x : Tset) {
			cnt++;    // �� ��°���� �� �� ����
			if(cnt==k)
				System.out.println(x);
			//System.out.println(cnt + " - " + x);
		}
		
/*
		HashMap<Integer, Integer> answer2 = new HashMap<>();
		int sum=0;
		
		for(int i=0; i<n-2; i++) {
			for(int j=1; j<n-1; j++) {
				for(int l=2; l<n; l++) {
					sum = sum + arr[i]+arr[j]+arr[l];
					answer.put(sum, answer.getOrDefault(sum, 0));
				}
			}
		} 
*/
	}

}

/*
 * 	TreeSet���� ����ϴ� �Լ���
 * 
 * 	1. Tset.add();
 * 		: �� �߰�
 * 	2. Tset.remove(143);
 * 		: �� ����
 * 	3. Tset.size();
 * 		: ���� ����. ������ ������ �˷���
 * 	4. Tset.first();
 * 		: �������������� �ּڰ�, ������������ �ִ��� ��ȯ
 * 	5. Tset.last();
 *  	: �������������� �ִ�, ������������ �ּڰ��� ��ȯ
 */
