package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10991 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		String space = " ";
		String star = "*";
		
		for(int i = 1; i < num; i++) {
			star += " *";
			space += " ";
		}
		for(int i = 1; i <= num; i++) {
			sb.append(space.substring(0, num-i)).append(star.substring(0, 2*i-1));
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
