package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10818 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int min = Integer.parseInt(st.nextToken());
		int max = min;
		
		for(int i = 1; i < num; i++) {
			int a = Integer.parseInt(st.nextToken());
			if(a > max) {
				max = a;
			}
			if(a < min) {
				min = a;
			}
		}
		
		System.out.println(min+" "+max);
		
	}
}
