package _01;
import java.util.*;

// 강의 내용
public class _09_숫자만_추출_isDigit {

	public static void main(String[] args) {
		
		String answer = "";
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(char x : str.toCharArray()) {
			// x가 숫자면(isDigit) answer에 추가
			if(Character.isDigit(x))
				answer += x;
		}
		
		// String으로 하면 맨 앞에 0이 붙으니까 int로 형변환
		int s = Integer.parseInt(answer);
		
		System.out.println(s);
		
	}
}
