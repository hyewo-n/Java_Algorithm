package _02;
import java.util.*;

public class _12_���丵 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();  // �л� ��
		int M = sc.nextInt();  // ���� �׽�Ʈ Ƚ��
		int arr[][] = new int[M][N];
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j] =0;
			}	
		} // �Է� �Ϸ�
	
		for(int i=0; i<N-1; i++) {
			for(int j=0; j<M; j++) {
				if(arr[j][i] > arr[j][i+1]) {
					
				}
			}
		}
		
		//System.out.println();

	}

}
