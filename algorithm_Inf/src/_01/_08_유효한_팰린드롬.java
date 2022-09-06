package _01;
import java.util.*;

public class _08_유효한_팰린드롬 {

	public static void main(String[] args) {

		String answer = "NO";
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//                                 A~Z가 아니면 ""으로 바꿈
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		//System.out.println(str);
		
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp))
			answer = "YES";

		System.out.println(answer);
		
	}
}