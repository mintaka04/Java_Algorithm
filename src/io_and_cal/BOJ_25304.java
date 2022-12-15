package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_25304 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total_price = Integer.parseInt(br.readLine());
		int num = Integer.parseInt(br.readLine());
		
		int cal_price = 0;
		
		for(int i = 1; i <= num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			cal_price += Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());
		}
		
		if( total_price == cal_price ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}
