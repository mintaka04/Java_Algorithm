package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_1463 {
	
	static int dp[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		dp = new int[num+1];
		Arrays.fill(dp, -1);
		dp[1] = dp[0] = 0;
			
		for(int i = 2; i <= num; i++) {
			make_one(i);
		}
		
		System.out.println(make_one(num));
				
	}
	
	static int make_one(int num) {
		
		if(dp[num] != -1) {
			return dp[num];
		}
			
		if(num%3 == 0 && num%2 == 0) {
			
			dp[num] = Math.min(make_one(num-1) + 1, Math.min(make_one(num/3) + 1, make_one(num/2) + 1));			
		
		}else if(num%3 == 0) {
			
			dp[num] = Math.min(make_one(num-1) + 1, make_one(num/3) + 1);
		
		}else if(num%2 == 0) {
			
			dp[num] = Math.min(make_one(num-1) + 1, make_one(num/2) + 1);
		
		}else {
			dp[num] = make_one(num-1) + 1;
		}
		
		return dp[num];
	}
}
