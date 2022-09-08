package _04;
import java.util.*;

public class _01_학급_회장 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		
		char answer=' ';
		
		HashMap<Character, Integer> map = new HashMap<>();
		// map.compute('A', 3); // 하면 key 값은 A이고 value 값은 3이 되는 것
		
		// str을 읽어서 알파벳 별로 HashMap에 저장
		for(char x : str.toCharArray()) {
			// 찾으려는 key나 value 값이 없을 수도 있음.
			// 그래서 getOrDefault 사용. x라는 키가 없다면 0을 리턴해라
			// 그리고 나서 1을 더해줘서 키 값을 정해주면 됌!
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		int max = Integer.MIN_VALUE;
		
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;   // 알파벳이 답이니까 key를 넣어줘야하지
			}
		}
		System.out.println(answer);
	}

}

/*
 * 	HashMap에서 사용하는 함수들
 * 
 * 	1. map.get('A') 
 * 	    : key 'A'에 해당하는 value 값을 가져옴
 * 	1. map.containsKey('A')
 * 	    : 'A' 라는 키 값이 있는지 검사하고 값을 true/false로 반환해줌
 *	2. map.size()
 *	    : key의 갯수를 알려줌
 * 	3. map.remove('A')   중요!
 *	    : 특정 키 값 삭제
 *	5. map.keySet()
 *	    : Map 객체를 탐색할 때 사용    중요!
 */
