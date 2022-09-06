package _01;
import java.util.*;

public class _07_회문_문자열_함수사용 {

	public static void main(String[] args) {

		String answer = "NO";
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		// 입력받은 문자 뒤집어서 저장
		String tmp = new StringBuilder(str).reverse().toString();
		
		// 그냥 equals는 대소문자를 구분함.
		if(str.equalsIgnoreCase(tmp)) 
			answer = "YES";
		
		System.out.println(answer);
	}
}