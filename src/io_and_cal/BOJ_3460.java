//이진수
//양의 정수 n이 주어졌을 때 이를 이진수로 나타내고 그 중 1의 위치를 모두 찾기.

package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3460 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= testCase; i++) {
			
			if(i != 1) sb.append(" ");
			
			int n = Integer.parseInt(br.readLine());		
			int j = 0;
			
			while(n!=0) {
				if(n%2==1) {
					if(j != 0) sb.append(" ");
					sb.append(j);
				}
				n /= 2;
				j++;
			}
			
		}
		
		System.out.println(sb.toString());
		
	}
}
