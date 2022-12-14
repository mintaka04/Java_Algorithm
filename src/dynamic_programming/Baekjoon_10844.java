package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10844 {
	
	static Long[][] dp;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		dp = new Long[num+1][10];
		dp[1][0] = 0L;
		for(int i = 1; i <= 9; i++) {
			dp[1][i] = 1L;
		}
		
		//state는 n자리 수일 때 x로 끝나는 경우의 수.
		//따라서 n에 대한 정보와 x에 대한 정보를 담아야 함 -> 2차원 배열이 필요.
		//x가 0이거나 9일 경우를 예외로 처리해주고 점화식 사용.
		
		//memoization을 사용해야겠다.
		//n의 최대값이 100인데, int는 10자리수까지만 표현 가능하므로 long 사용.
		// 그런데 안에 있는지 없는지 편하게 하기 위해 long 대신 Long 사용!!!
		
		long ans = 0;
		
		for(int i = 0; i <= 9; i++) {
			ans += easyStairs(num, i);
		}
		
		System.out.println(ans % 1000000000);
		
	}
	
	static long easyStairs(int num, int val) {
	
		if(num==1) {
			return dp[1][val];
		}
		
		if( dp[num][val] == null ) {
			if(val == 0) {
				dp[num][val] = easyStairs(num-1, 1);
			}else if(val == 9) {
				dp[num][val] = easyStairs(num-1, 8);
			}else {
				dp[num][val] = easyStairs(num-1, val-1) + easyStairs(num-1, val+1);
			}			
		}
		
		return dp[num][val] % 1000000000;
		
	}
}
