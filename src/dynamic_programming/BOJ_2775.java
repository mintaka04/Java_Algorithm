package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2775 {
	
	private static int[][] apart = new int[15][15];
	
	public static void main(String[] args) throws IOException{
		for(int i = 1; i <= 14; i++) {
			apart[0][i] = i;
			apart[i][1] = 1;
		}
		
		for(int i = 2; i <= 14; i++) {
			for(int j = 1; j <= 14; j++) {
				apart[j][i] = apart[j][i-1] + apart[j-1][i];
			}
		}
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testCase = Integer.parseInt(br.readLine());
		int floor = 0, roomNum = 0;
		
		while(testCase-->0) {
			floor = Integer.parseInt(br.readLine());
			roomNum = Integer.parseInt(br.readLine());
			sb.append(apart[floor][roomNum]).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
