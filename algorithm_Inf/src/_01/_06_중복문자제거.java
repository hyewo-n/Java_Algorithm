package _01;
import java.util.*;

public class _06_중복문자제거 {

	public static void main(String[] args) {
		
		String answer="";
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			//System.out.println(str.charAt(i) + " " + i + " "
			//		             + str.indexOf(str.charAt(i)));
			
			// indexOf는 문자가 처음 발견된 인덱스 값을 리턴해줌.
			// 따라서 indexOf의 값과 i의 값이 같을 때만 answer에 누적 저장해주면 됨
			
			if(str.indexOf(str.charAt(i)) == i)
				answer += str.charAt(i);
		}
		
		System.out.println(answer);
		
	}
}
