package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2742 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = num; i > 0; i--) {
			sb.append(i).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
	//sysout보다 stringbuilder가 빠름.
}
