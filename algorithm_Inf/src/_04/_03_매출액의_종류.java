package _04;
import java.util.*;

public class _03_�������_���� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		} // �Է� �Ϸ�
		
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> HM = new HashMap<>();
		
		// ���� ����
		for(int i=0; i<k-1; i++) {
			HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
		}
		
		// �������� �˰���
		int lt=0;
		for(int rt=k-1; rt<n; rt++) {
			HM.put(arr[rt],  HM.getOrDefault(arr[rt], 0)+1);
			answer.add(HM.size());
			
			// �����츦 �� ĭ �б� ���� lt �� ����
			HM.put(arr[lt], HM.get(arr[lt])-1);
			// ���µ� value ���� 0�� �Ǹ� key ���� ������
			if(HM.get(arr[lt])==0)
				HM.remove(arr[lt]);
			// lt ����
			lt++;
		}
		for(int x : answer) {
			System.out.print(x+ " ");
		}
	}
}