package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3003 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int[] arr = {1, 1, 2, 2, 2, 8};
		
		for(int i = 0; i < 6; i++) {
			sb.append(arr[i] - Integer.parseInt(st.nextToken())).append(" ");
		}
		
		System.out.println(sb.toString());
		
	}
}