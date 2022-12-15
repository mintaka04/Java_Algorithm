package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10807 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer v = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= num; i ++) {
			if( Integer.parseInt(st.nextToken()) == v ) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}
}
