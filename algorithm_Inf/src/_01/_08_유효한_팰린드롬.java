package _01;
import java.util.*;

public class _08_��ȿ��_�Ӹ���� {

	public static void main(String[] args) {

		String answer = "NO";
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//                                 A~Z�� �ƴϸ� ""���� �ٲ�
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		//System.out.println(str);
		
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp))
			answer = "YES";

		System.out.println(answer);
		
	}
}