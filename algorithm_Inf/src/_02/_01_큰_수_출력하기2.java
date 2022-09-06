package _02;
import java.util.*;

public class _01_큰_수_출력하기2 {

	public static void main(String[] args) {
		
		String answer = "";
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		answer += String.valueOf(arr[0] + " ");
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > arr[i-1])
				answer += String.valueOf(arr[i] + " ");
		}
		System.out.println(answer);
	}
}
