package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2869 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		 //arr[2] - arr[0] < (arr[0] - arr[1]) * n 인 n의 최소값.
		
		int n = (arr[2] - arr[0]) / (arr[0] - arr[1]);
		
		if((arr[2] - arr[0]) % (arr[0] - arr[1]) != 0) {
			System.out.println(n+2);
		}else {
			System.out.println(n+1);
		}
		
	}
}
