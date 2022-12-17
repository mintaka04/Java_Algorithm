package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9465_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testNum = Integer.parseInt(br.readLine());
        while (testNum-- > 0) {
            int len = Integer.parseInt(br.readLine());
            int[][] dp = new int[2][len];
            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < len; j++) {
                    dp[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            sb.append(findMaxScoreOfStickers(dp, len)).append('\n');
        }

        System.out.println(sb);
	}
	
	 public static int findMaxScoreOfStickers(int[][] dp, int len) {
	        if (len <= 1) return Math.max(dp[0][0], dp[1][0]);
	        
	        dp[0][1] += dp[1][0];
	        dp[1][1] += dp[0][0];
	        for (int i = 2; i < len; i++) {
	            dp[0][i] = Math.max(Math.max(dp[0][i - 2], dp[1][i - 2]), dp[1][i - 1]) + dp[0][i];
	            dp[1][i] = Math.max(Math.max(dp[1][i - 2], dp[0][i - 2]), dp[0][i - 1]) + dp[1][i];
	        }

	        return Math.max(dp[0][len - 1], dp[1][len - 1]);
	    }
}

//배열 굳이 두개 쓰지 않아도 됨!