package _04;
import java.util.*;

public class _04_모든_아나그램_찾기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
	
		int answer=0;
		
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		
		// bm 미리 세팅
		for(char x : b.toCharArray()) {
			bm.put(x, bm.getOrDefault(x, 0)+1);
		}
		// am 미리 세팅
		// b의 길이보다 1개 작게 설정. 1개는 처리하지 말고 먼저 세팅
		int L = b.length()-1;
		for(int i=0; i<L; i++) {
			am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
		}
		
		int lt=0;
		// am을 L전까지 세팅해놨으므로 rt는 L부터 돌면 됌
		for(int rt=L; rt<a.length(); rt++) {
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
			if(am.equals(bm))
				answer++;
			am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
			if(am.get(a.charAt(lt))==0)
				am.remove(a.charAt(lt));
			lt++;
		}
		
		System.out.println(answer);
	}
 
}
