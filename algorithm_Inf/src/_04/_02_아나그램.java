package _04;
import java.util.*;

public class _02_아나그램 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : a.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		for(char x : b.toCharArray()) {
			// key 값이 존재하는지 검사
			if(!map.containsKey(x) || map.get(x)==0)
				answer = "NO";
				//System.out.println("NO");
			// 위에서 세팅을 해놓았기 때문에 값이 없을리는 없음. get() 사용
			map.put(x,  map.get(x)-1);
		}
		System.out.println(answer);
	}
}