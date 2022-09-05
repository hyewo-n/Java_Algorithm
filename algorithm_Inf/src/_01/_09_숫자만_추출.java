package _01;
import java.util.*;

// 혼자서 해결 완료 오예!
public class _09_숫자만_추출 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.toUpperCase().replaceAll("[A-Z]", "");
		
		int s = Integer.parseInt(str);
		
		System.out.println(s);
		
	}

}
