package _01;
import java.util.*;

public class _06_�ߺ��������� {

	public static void main(String[] args) {
		
		String answer="";
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			//System.out.println(str.charAt(i) + " " + i + " "
			//		             + str.indexOf(str.charAt(i)));
			
			// indexOf�� ���ڰ� ó�� �߰ߵ� �ε��� ���� ��������.
			// ���� indexOf�� ���� i�� ���� ���� ���� answer�� ���� �������ָ� ��
			
			if(str.indexOf(str.charAt(i)) == i)
				answer += str.charAt(i);
		}
		
		System.out.println(answer);
		
	}
}
