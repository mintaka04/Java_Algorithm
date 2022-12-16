package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2588 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(n1*(n2%10)).append("\n");
		sb.append(n1*(n2%100/10)).append("\n");
		sb.append(n1*(n2/100)).append("\n");
		sb.append(n1*n2);
		
		System.out.println(sb.toString());
	}
}
