package _06;
import java.util.*;

public class _08_�̺а˻� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}  // �Է¿Ϸ�

		int answer = 0;
		// �̺а˻��� ������ ������ �Ǿ��־�� ��
		Arrays.sort(arr);
		
		int lt = 0;
		int rt = n-1;
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(arr[mid]==m) {
				answer = mid+1;
				break;
			}
			if(arr[mid] > m)
				rt = mid - 1;
			else
				lt = mid + 1;
		}
		System.out.println(answer);	
	}
}