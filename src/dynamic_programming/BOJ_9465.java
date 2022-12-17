package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9465 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int caseNum = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= caseNum; i++) {
			
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[2][n+1];
			int[][] dp = new int[2][n+1];
			
			
			for(int j = 0; j < 2; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int k = 1; k <= n; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			
			dp[0][1] = arr[0][1];
			dp[1][1] = arr[1][1];
			
			for(int j = 2; j <= n; j++) {
				dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2]) + arr[0][j];
				dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2]) + arr[1][j];
			}
			
			sb.append(Math.max(dp[0][n], dp[1][n])).append("\n");
		}
		System.out.println(sb.toString());
		
	}
}
//풀었지만 너무 오래 걸림...
