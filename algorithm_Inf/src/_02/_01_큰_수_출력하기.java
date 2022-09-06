package _02;
import java.util.*;

public class _01_큰_수_출력하기 {

	public static void main(String[] args) {
		
		// 나는 그냥 배열로 하려고 했는데 그렇게 해보니 중간에 0 값이 들어가는게 게 생김
		// String answer로 추가하려고 했는데 string이라서 그런지 오답
		// ArrayList 사용이 답!
		// 아님;; 그냥 문제 잘못 이해해서 그런거였음..,
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		answer.add(arr[0]);
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > arr[i-1])
				answer.add(arr[i]);
		}
		for(int x : answer)
			// println말고 이렇게...
			System.out.print(x + " ");
	}

}
