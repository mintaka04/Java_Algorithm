package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st1.nextToken());
		int x = Integer.parseInt(st1.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
			if(arr[i] < x) sb.append(arr[i]+" ");
		}
		
		System.out.println(sb);
		br.close();
	}
}

// 112ms.