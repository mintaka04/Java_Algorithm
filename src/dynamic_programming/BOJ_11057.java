package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11057 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result = 0;
		
		int[][] dp = new int[num+1][10];
		
		for(int i = 0; i < 10; i++) {
			dp[1][i] = 1;
		}
		
		for(int i = 2; i <= num; i++) {
			dp[i][0] = 1;
			
			for(int j = 1; j < 10; j++) {
				dp[i][j] = (dp[i][j-1] + dp[i-1][j]) % 10007;
			}
			
		}
		
		for(int i = 0; i < 10; i++) {
			result += dp[num][i];
		}
		
		System.out.println(result%10007);
	}
}


/*
 * num : 수의 길이, x : 끝자리수
 * s(num, x) : num 길이이고 끝자리가 x인 오르막수의 개수
 * 
 * s(num, x) = s(num-1, x) + s(num-1, x-1) + ... + s(num-1, 0);
 * 즉, s(num, x) = s(num, x-1) + s(num-1, x)
 * 어차피 다 구해야 할 것 같으니 tabulation 사용.
 */
