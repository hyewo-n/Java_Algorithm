package _05;
import java.util.*;

public class _07_��������_���� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String need = sc.next();
		String plan = sc.next();
		
		String answer = "YES";
		Queue<Character> Q = new LinkedList<>();
		
		// �ʼ����� ���� queue�� ����
		for(char x : need.toCharArray())
			Q.offer(x);
		
		for(char x : plan.toCharArray()) {
			if(Q.contains(x)) {        // �ʼ������� ���� ��
				if(x != Q.poll())      // Q�� �� �հ� �ٸ���(�ʼ����� ������ �ٸ���)
					answer = "NO";
			}
		}
		// �ʼ������� �̼����� �ʾ��� ��
		// �ʼ������� �־�� Q�� ���� �����ִٴ� ���� �ʼ������� �̼����� ���� ��
		if(!Q.isEmpty())
			answer = "NO";
		
		System.out.println(answer);
		
/*
		String tmp ="";
		
		for(int x : hyun.toCharArray()) {
			for(int i=0; i<str.length(); i++) {
				if(x==str.charAt(i))
					tmp += Q.poll();
			}
		}
		if(tmp.equals(str))
			answer = "YES";
		else
			answer = "NO";
*/
		
		
	}

}
