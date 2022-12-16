package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10430 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[3];
		
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		sb.append((arr[0]+arr[1])%arr[2]).append("\n");
		sb.append(((arr[0]%arr[2])+(arr[1]%arr[2]))%arr[2]).append("\n");
		sb.append((arr[0]*arr[1])%arr[2]).append("\n");
		sb.append(((arr[0]%arr[2])*(arr[1]%arr[2]))%arr[2]).append("\n");
		
		System.out.println(sb.toString());
		
	}
}
