package _01;

import java.util.Scanner;

public class _01_문자찾기 {

	public static void main(String[] args) {
		
		int answer = 0; 
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		str= str.toUpperCase();
		c = Character.toUpperCase(c);
		
		//System.out.println(str);
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==c) {
				answer++;
			}
		}
		
		System.out.println(answer);
		
	}
}