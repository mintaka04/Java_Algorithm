package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_10952 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while( true ) {
			st = new StringTokenizer(br.readLine(), " ");
			
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a==0 && b==0) {
				break;
			}
			sb.append(a+b).append("\n");
		}
		
		System.out.println(sb.toString());
//			
//		
//		st = new StringTokenizer(br.readLine());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		
		//이 문제는 ctrl+z 하면 nullpointerexception이 뜨는데
		//엔터로 끝내게 되면 정상적으로 출력된다...
	}
}
