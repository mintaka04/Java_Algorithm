package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1712 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
//		int a = Integer.parseInt(st.nextToken());
//		int b = Integer.parseInt(st.nextToken());
//		int c = Integer.parseInt(st.nextToken());
//		
//		if(b>=c) {
//			System.out.println("-1");
//			return;
//		}
//		
//		int cnt = 1;
//		while(true) {
//			if(a < (c-b)*(cnt++)) break;
//		}
//		System.out.println(cnt-1);
		
		long[] num = new long[3];
		for(int i = 0; i < 3; i++) {
			num[i] = Long.parseLong(st.nextToken());
		}
		
		long result = -1;
		if(num[1] < num[2]) {
			result = 1 + (num[0] / (num[2] - num[1]));
		}
		System.out.println(result);
		
	}
}

