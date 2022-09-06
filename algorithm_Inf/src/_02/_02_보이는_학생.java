package _02;
import java.util.*;

public class _02_보이는_학생 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 맨 앞의 학생은 항상 보이므로
		int max = arr[0];
		int answer=1;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				answer++;
			}
		}
		System.out.println(answer);
	}
}
