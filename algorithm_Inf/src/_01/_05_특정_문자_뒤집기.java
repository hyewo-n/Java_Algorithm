package _01;
import java.util.*;

public class _05_Ư��_����_������ {
	public static void main(String[] args) {
	
		String answer = "";
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] s = str.toCharArray();  //�迭�� �ٲپ ����
		int lt = 0;
		int rt = str.length()-1;
		
		// �ܿ��α�!
		// ���� reverse �� �� while���� ������ lt<rt ���
		while(lt<rt) {
			// ���� ���ĺ��� �ƴϸ�
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