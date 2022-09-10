package _04;
import java.util.*;

public class _03_매출액의_종류 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		} // 입력 완료
		
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> HM = new HashMap<>();
		
		// 먼저 세팅
		for(int i=0; i<k-1; i++) {
			HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
		}
		
		// 투포인터 알고리즘
		int lt=0;
		for(int rt=k-1; rt<n; rt++) {
			HM.put(arr[rt],  HM.getOrDefault(arr[rt], 0)+1);
			answer.add(HM.size());
			
			// 윈도우를 한 칸 밀기 전에 lt 값 빼줌
			HM.put(arr[lt], HM.get(arr[lt])-1);
			// 뺐는데 value 값이 0이 되면 key 값도 지워줌
			if(HM.get(arr[lt])==0)
				HM.remove(arr[lt]);
			// lt 증가
			lt++;
		}
		for(int x : answer) {
			System.out.print(x+ " ");
		}
	}
}