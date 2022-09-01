package _01;

import java.util.*;

public class _04_단어_뒤집기 {

	public static void main(String[] args) {
		
		ArrayList<String> answer = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str[] = new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = sc.next();
		}
		
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}

		for(String m : answer) {
			System.out.println(m);
		}
		
	}

}
/*
	String으로 객체를 생성하면 그 값을 변경할 수 없음.
	그래서 새로운 객체를 생성해서 변경된 값을 다시 대입해야 함
	  -> 객체가 계속 생성되는 단점!
	StringBuilder는 replace, delete 등등 처음에 생성한 객체로 모두 가능
	그래서 객체를 여러 개 만들지 않아도 돼서 메모리 낭비가 없음.
*/