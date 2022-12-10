package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_1463 {
	
	static int dp[] = new int[1000001];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Arrays.fill(dp, -1);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result = make_one(num);
		
		System.out.println(result);
				
	}
	
	static int make_one(int num) {
		
		if(dp[num] != -1) {
			return dp[num];
		}
		
		if(num == 1) {
			
			return 0;
			
		}else {
			
			dp[num] = make_one(num-1) + 1;			
			
			if(num%3 == 0) {
				dp[num] = Math.min(dp[num], make_one(num/3) + 1);
			}
			if(num%2 == 0) {
				dp[num] = Math.min(dp[num], make_one(num/2) + 1);
			}
			
			return dp[num];
		}
	}
}
