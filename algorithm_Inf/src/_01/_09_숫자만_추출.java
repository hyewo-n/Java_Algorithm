package _01;
import java.util.*;

// ȥ�ڼ� �ذ� �Ϸ� ����!
public class _09_���ڸ�_���� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.toUpperCase().replaceAll("[A-Z]", "");
		
		int s = Integer.parseInt(str);
		
		System.out.println(s);
		
	}

}
