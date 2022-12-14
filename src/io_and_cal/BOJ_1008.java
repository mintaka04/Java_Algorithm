package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1008 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		double a = Double.parseDouble(input.charAt(0)+"");
		double b = Double.parseDouble(input.charAt(2)+"");
		
		System.out.println(a/b);
	}
}
