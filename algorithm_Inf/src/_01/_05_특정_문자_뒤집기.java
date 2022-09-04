package _01;
import java.util.*;

public class _05_특정_문자_뒤집기 {
	public static void main(String[] args) {
	
		String answer = "";
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] s = str.toCharArray();
		int lt =0;
		int rt = str.length()-1;
		
		while(lt<rt) {
			if(!Character.isAlphabetic(s[lt]))
				lt++;
			else if(!Character.isAlphabetic(s[rt]))
				rt--;
			else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s);
		System.out.println(answer);
		
		
		
	}
}
