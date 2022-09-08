package _04;
import java.util.*;

public class _01_�б�_ȸ�� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		
		char answer=' ';
		
		HashMap<Character, Integer> map = new HashMap<>();
		// map.compute('A', 3); // �ϸ� key ���� A�̰� value ���� 3�� �Ǵ� ��
		
		// str�� �о ���ĺ� ���� HashMap�� ����
		for(char x : str.toCharArray()) {
			// ã������ key�� value ���� ���� ���� ����.
			// �׷��� getOrDefault ���. x��� Ű�� ���ٸ� 0�� �����ض�
			// �׸��� ���� 1�� �����༭ Ű ���� �����ָ� ��!
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		int max = Integer.MIN_VALUE;
		
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;   // ���ĺ��� ���̴ϱ� key�� �־��������
			}
		}
		System.out.println(answer);
	}

}

/*
 * 	HashMap���� ����ϴ� �Լ���
 * 
 * 	1. map.get('A') 
 * 	    : key 'A'�� �ش��ϴ� value ���� ������
 * 	1. map.containsKey('A')
 * 	    : 'A' ��� Ű ���� �ִ��� �˻��ϰ� ���� true/false�� ��ȯ����
 *	2. map.size()
 *	    : key�� ������ �˷���
 * 	3. map.remove('A')   �߿�!
 *	    : Ư�� Ű �� ����
 *	5. map.keySet()
 *	    : Map ��ü�� Ž���� �� ���    �߿�!
 */
