package _02;
import java.util.*;

public class _03_가위바위보 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arrA[] = new int[n];
		int arrB[] = new int[n];
		for(int i=0; i<n; i++) {
			arrA[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			arrB[i] = sc.nextInt();
		}
		
		String answer = "";
		for(int i=0; i<n; i++) {
			if(arrA[i]==1 && arrB[i]==3)
				answer += 'A';
			else if(arrA[i]==2 && arrB[i]==1)
				answer += 'A';
			else if(arrA[i]==3 && arrB[i]==2)
				answer += 'A';
			else if(arrA[i]==arrB[i])
				answer += 'D';
			else
				answer += 'B';
		}
		for(char x : answer.toCharArray()) {
			System.out.println(x);
		}
	}
}