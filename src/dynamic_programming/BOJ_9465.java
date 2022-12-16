package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9465 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= caseNum; i++) {
			
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[3][n+1];
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				arr[1][i] = Integer.parseInt(st1.nextToken());
			}
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				arr[2][i] = Integer.parseInt(st2.nextToken());
			}
			
			
			
			
			
		}
		
		
	}
}

////아직 못풀었다...