package _01;
import java.util.*;

public class _12_��ȣ�ؼ� {

	public static void main(String[] args) {

		String answer =""; 
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		String str = sc.next();
		
		for(int i=0; i<t; i++) {
			String tmp = str.substring(0, 7);
			tmp = tmp.replace('#', '1').replace('*', '0');
			// string�� int�� ����ȯ. 2������ ����Ѵ�.
			int num = Integer.parseInt(tmp, 2);
			// �ƽ�Ű�ڵ� �˾Ƽ� ����ȯ ����..��
			answer = answer + (char)num;
			str = str.substring(7);
			//System.out.println(tmp);
		}
		
		System.out.println(answer);
		
	}
}
