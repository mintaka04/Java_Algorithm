package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2739 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i < 10; i++) {
			
			sb.append(num+" * "+i+" = "+(num*i)).append("\n");
			
		}
		
		System.out.println(sb.toString());
		
	}
}
