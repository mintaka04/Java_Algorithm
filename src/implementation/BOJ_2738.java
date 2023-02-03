package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2738 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr1 = new int[N][M];
		int[][] arr2 = new int[N][M];
		
		for(int j = 0; j < N; j++) {
			st = new StringTokenizer(br.readLine());
			for(int k = 0; k < M; k++) arr1[j][k] = Integer.parseInt(st.nextToken());
		}
		for(int j = 0; j < N; j++) {
			st = new StringTokenizer(br.readLine());
			for(int k = 0; k < M; k++) arr2[j][k] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				sb.append(arr1[i][j] + arr2[i][j] + " ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
