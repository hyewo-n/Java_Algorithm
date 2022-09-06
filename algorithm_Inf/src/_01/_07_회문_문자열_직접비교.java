package _01;
import java.util.*;

public class _07_회문_문자열_직접비교 {

	public static void main(String[] args) {
		
		String answer = "YES";
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		
		int len = str.length();
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i) != str.charAt(len-i-1))
				answer = "NO";
		}
		
		System.out.println(answer);
			
		/*
		char[] arr = str.toUpperCase().toCharArray();
		for(int i=0, j=arr.length-1; i<arr.length/2&j>arr.length/2; i++, j--) {
			if(arr[i] == arr[j])
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		*/
	}
}