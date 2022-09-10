package _05;
import java.util.*;

public class _08_응급실 {

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
		
		// 환자번호와 위험성을 함께 객체로 묶어서 Queue에 저장
		for(int i=0; i<n; i++) {
			Q.offer(new Person(i, arr[i]));
		}
		
		while(!Q.isEmpty()) {  // Q에 값이 있으면 계속 돌아감
			Person tmp = Q.poll(); 
			// tmp라는 환자가 진료를 볼 수 있느냐
			// 하나 꺼내서 for문 돌리면서 검사
			for(Person x : Q) {
				if(x.priority > tmp.priority) {  // 위험성이 더 놓은 환자가 있다면
					Q.offer(tmp);                // Q의 끝에 다시 넣어줌
					tmp=null;
					break;
				}
			}
			// 여기로 넘어오면 진료를 받을 수 있다는 것
			if(tmp != null) {
				answer++;     // 일단 count 해주고
				if(tmp.id==m)  // 해당환자 번호와 맞으면 출력
					System.out.println(answer);
			}
		}	
	}
}

class Person{
	int id;         // 환자 번호
	int priority;   // 위험도
	public Person(int id, int priority) {
		this.id=id;
		this.priority=priority;
	}
}
