package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10818 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int min = Integer.parseInt(st.nextToken());
		int max = min;
		
		while(caseNum-- > 1) {
			int n = Integer.parseInt(st.nextToken());
			if(n > max) max = n;
			if(n < min) min = n;
		}
		
		System.out.println(min + " " + max);
		
	}
}
