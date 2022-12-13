package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9095 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		int[] dp= new int[12];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i = 4; i <= 10; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		
		for(int i = 0; i < num; i++) {
			
			int tCase = Integer.parseInt(br.readLine());
			sb.append(dp[tCase]).append("\n");
			
		}
		
		System.out.println(sb.toString());
		
	}
}

// s(n) = s(n-1)        + s(n-2) 		+ s(n-3)
//		= 뒤가 1로 끝나는 것 + 뒤가 2로 끝나는 것 + 뒤가 3으로 끝나는 것

//어차피 모든 계산 필요 -> tabulation 사용