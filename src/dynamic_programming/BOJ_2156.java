package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2156 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//s(n) = n번째 포도주를 마실 때 max 포도주량
		//s(n) = max( s(n-2), s(n-3)+(n-1) ) + n
		//		...	   n-3  n-2 n-1	n
		//			   max  x   o   o
		// 				   max  x	o
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int[] arr = new int[num+1];
		int[] dp = new int[num+1];
		
		arr[1] = Integer.parseInt(br.readLine());
		dp[1] = arr[1];
		
		if(num >= 2) {
			arr[2] = Integer.parseInt(br.readLine());
			dp[2] = dp[1] + arr[2];
		}

		//조건에 꼭 마지막 잔을 마시지 않아도 되므로 처음부터 num-1과 num비교해서
		//큰 값을 넣어주어야 한다.
		
		for(int i = 3; i <= num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			dp[i] = Math.max(Math.max(dp[i-2], dp[i-3]+arr[i-1]) + arr[i], dp[i-1]);
		}
		
		System.out.println(Math.max(dp[num-1], dp[num]));
		
	}
}
