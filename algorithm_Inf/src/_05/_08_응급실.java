package _05;
import java.util.*;

public class _08_���޽� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int answer = 0;
		Queue<Person> Q = new LinkedList<>();
		
		// ȯ�ڹ�ȣ�� ���輺�� �Բ� ��ü�� ��� Queue�� ����
		for(int i=0; i<n; i++) {
			Q.offer(new Person(i, arr[i]));
		}
		
		while(!Q.isEmpty()) {  // Q�� ���� ������ ��� ���ư�
			Person tmp = Q.poll(); 
			// tmp��� ȯ�ڰ� ���Ḧ �� �� �ִ���
			// �ϳ� ������ for�� �����鼭 �˻�
			for(Person x : Q) {
				if(x.priority > tmp.priority) {  // ���輺�� �� ���� ȯ�ڰ� �ִٸ�
					Q.offer(tmp);                // Q�� ���� �ٽ� �־���
					tmp=null;
					break;
				}
			}
			// ����� �Ѿ���� ���Ḧ ���� �� �ִٴ� ��
			if(tmp != null) {
				answer++;     // �ϴ� count ���ְ�
				if(tmp.id==m)  // �ش�ȯ�� ��ȣ�� ������ ���
					System.out.println(answer);
			}
		}	
	}
}

class Person{
	int id;         // ȯ�� ��ȣ
	int priority;   // ���赵
	public Person(int id, int priority) {
		this.id=id;
		this.priority=priority;
	}
}
