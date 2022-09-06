package _01;
import java.util.*;

public class _12_암호해석 {

	public static void main(String[] args) {

		String answer =""; 
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		String str = sc.next();
		
		for(int i=0; i<t; i++) {
			String tmp = str.substring(0, 7);
			tmp = tmp.replace('#', '1').replace('*', '0');
			// string을 int로 형변환. 2진수로 계산한다.
			int num = Integer.parseInt(tmp, 2);
			// 아스키코드 알아서 형변환 해줌..오
			answer = answer + (char)num;
			str = str.substring(7);
			//System.out.println(tmp);
		}
		
		System.out.println(answer);
		
	}
}
