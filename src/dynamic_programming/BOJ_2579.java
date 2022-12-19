package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2579 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		s(n) = 계단 n까지 있을 때 max값
//		s(n) = max( s(n-3)+(n-1), s(n-2) ) + n
		
//num이 1이하일때 따로 설정해주어야 함!
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int[] arr = new int[num+1];
		int[] dp = new int[num+1];
		
		arr[1] = Integer.parseInt(br.readLine());	
		dp[1] = arr[1];
		
		if(num >= 2) {
			arr[2] = Integer.parseInt(br.readLine());
			dp[2] = arr[2] + dp[1];
		}
		
		for(int i = 3; i <= num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			dp[i] = Math.max(dp[i-3]+arr[i-1], dp[i-2]) + arr[i];
		}
		
		System.out.println(dp[num]);
		
		
	}
}
