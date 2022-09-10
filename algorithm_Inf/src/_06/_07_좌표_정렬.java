package _06;
import java.util.*;

//Àý¹Ý¸¸ ¼º°ø..?
public class _07_ÁÂÇ¥_Á¤·Ä {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[][] = new int[n][2];
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = sc.nextInt();
			}			
		}   // ÀÔ·Â ¿Ï·á

		for(int i=0; i<n-1; i++) {
			if(arr[i][0] > arr[i+1][0]) {
				//x°ª ¹Ù²ã..
				int tmp = arr[i][0];
				arr[i][0] = arr[i+1][0];
				arr[i+1][0] = tmp;
				
				//y°ª ¹Ù²ã..
				tmp = arr[i][1];
				arr[i][1] = arr[i+1][1];
				arr[i+1][1] = tmp;
			}
		}
		

		for(int i=0; i<n-1; i++) {
			if(arr[i][1] > arr[i+1][1] && arr[i][0] == arr[i+1][0] ) {
				//x°ª ¹Ù²ã..
				int tmp = arr[i][0];
				arr[i][0] = arr[i+1][0];
				arr[i+1][0] = tmp;
				
				//y°ª ¹Ù²ã..
				tmp = arr[i][1];
				arr[i][1] = arr[i+1][1];
				arr[i+1][1] = tmp;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(arr[i][j] + " ");
			}			
			System.out.println();
		}
		
	}

}
