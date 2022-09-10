package _04;
import java.util.*;

public class _05_K번째_큰_수 {
/*
 * 	TreeSet은 중복을 제거하면서 정렬까지 자동으로 됌
 * 	이진검색트리로 자료 저장
 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		} // 입력 완료
		
		int answer;
		// TreeSet은 기본적으로 오름차순. 내림차순으로 할거면 reverseOrder() 넣어준다
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		
		// 3장 뽑아서 도는 거니까 3중 for문(이건 생각해냈음. 처음 시작 범위만 잘못 설정)
		// 끝나는 범위 그냥 n을으로 둬도 되냐? 그냥 둬도 됌. 
		// 뒤에 for문에서 결국 조건이 맞지 않기 때문에 false 됌
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int l=j+1; l<n; l++) {
					Tset.add(arr[i]+arr[j]+arr[l]);   // 값 추가 add로
				}
			}
		} // for문 끝

		int cnt=0;
		for(int x : Tset) {
			cnt++;    // 몇 번째인지 알 수 있음
			if(cnt==k)
				System.out.println(x);
			//System.out.println(cnt + " - " + x);
		}
		
/*
		HashMap<Integer, Integer> answer2 = new HashMap<>();
		int sum=0;
		
		for(int i=0; i<n-2; i++) {
			for(int j=1; j<n-1; j++) {
				for(int l=2; l<n; l++) {
					sum = sum + arr[i]+arr[j]+arr[l];
					answer.put(sum, answer.getOrDefault(sum, 0));
				}
			}
		} 
*/
	}

}

/*
 * 	TreeSet에서 사용하는 함수들
 * 
 * 	1. Tset.add();
 * 		: 값 추가
 * 	2. Tset.remove(143);
 * 		: 값 삭제
 * 	3. Tset.size();
 * 		: 값의 갯수. 원소의 갯수를 알려줌
 * 	4. Tset.first();
 * 		: 오름차순에서는 최솟값, 내림차순에선 최댓값을 반환
 * 	5. Tset.last();
 *  	: 오름차순에서는 최댓값, 내림차순에선 최솟값을 반환
 */
