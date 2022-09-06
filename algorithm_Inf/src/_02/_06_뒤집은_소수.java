package _02;
import java.util.*;

public class _06_뒤집은_소수 {

	public static void main(String[] args) {
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			int tmp = arr[i];
			int res = 0;
			while(tmp>0) {
				int t = tmp % 10;
				res = res*10 + t;
				tmp = tmp/10;
			}			
			//System.out.println(res);
			if(isPrime(res))
				answer.add(res);
		}
		
		for(int x : answer)
			System.out.print(x + " ");
	}
	
	public static boolean isPrime(int num) {
		if(num==1)
			return false;
		for(int i=2; i<num; i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
}
