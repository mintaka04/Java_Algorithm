package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_11726 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int[] dp = new int[1001];
			//여기서 num+1로 주면 ArrayIndexOutOfBounds
		dp[1] = 1;
		dp[2] = 2;
		for(int i = 3; i <= num; i++) {
			dp[i] = (dp[i-1] + dp[i-2])%10007;
		}
		
		System.out.println(dp[num]);
	}
}