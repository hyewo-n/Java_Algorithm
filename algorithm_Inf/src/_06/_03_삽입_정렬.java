package _06;
import java.util.*;

public class _03_삽입_정렬 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=1; i<n; i++) {
			int tmp = arr[i], j;    // j를 여기서 선언해줘야 for문 밖에서도 j 사용 가능
			for(j=i-1; j>=0; j--) {
				if(arr[j] > tmp)
					arr[j+1] = arr[j];
				else
					break;
			}
			arr[j+1] = tmp;
		}
		for(int x : arr) {
			System.out.print(x + " ");
		}
		

	}

}
