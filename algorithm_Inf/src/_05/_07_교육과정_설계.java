package _05;
import java.util.*;

public class _07_교육과정_설계 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String need = sc.next();
		String plan = sc.next();
		
		String answer = "YES";
		Queue<Character> Q = new LinkedList<>();
		
		// 필수과목 먼저 queue에 저장
		for(char x : need.toCharArray())
			Q.offer(x);
		
		for(char x : plan.toCharArray()) {
			if(Q.contains(x)) {        // 필수과목이 맞을 때
				if(x != Q.poll())      // Q의 맨 앞과 다르면(필수과목 순서가 다르면)
					answer = "NO";
			}
		}
		// 필수과목을 이수하지 않았을 때
		// 필수과목을 넣어둔 Q에 값이 남아있다는 것은 필수과목을 이수하지 않은 것
		if(!Q.isEmpty())
			answer = "NO";
		
		System.out.println(answer);
		
/*
		String tmp ="";
		
		for(int x : hyun.toCharArray()) {
			for(int i=0; i<str.length(); i++) {
				if(x==str.charAt(i))
					tmp += Q.poll();
			}
		}
		if(tmp.equals(str))
			answer = "YES";
		else
			answer = "NO";
*/
		
		
	}

}
