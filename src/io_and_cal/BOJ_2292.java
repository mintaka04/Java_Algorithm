package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2292 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()) - 1;
		int cnt = 1;
		
		if(n == 0) System.out.println(1);
		else {
			while(n > 0) {
				n -= (6*cnt);
				cnt++;
			}
			System.out.println(cnt);
		}
		
	}
}
