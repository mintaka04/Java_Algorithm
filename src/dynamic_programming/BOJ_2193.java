package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2193 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		long[][] dp = new long[num+1][2];
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		for(int i = 2; i <= num; i++) {
			dp[i][0] = dp[i-1][0] + dp[i-1][1];
			dp[i][1] = dp[i-1][0];
		}
		
		System.out.println(dp[num][0] + dp[num][1]);
		
	}
}
/*
 * num을 숫자 길이, x를 끝자리 수라고 할 때
 * 
 * x=1 이면
 * dp[num][1] = dp[num-1][0]
 * 
 * x=0이면
 * dp[num][0] = dp[num-1][0] + dp[num-1][1] 
 * 
 * 주의할 점 : 
 * 결과 길이가 10자리수를 넘어가기 때문에 int 사용 불가. long 써주기.
 */
