//쉽게 푸는 문제.
//구간합 구하기?

package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1292 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int startNum = Integer.parseInt(st.nextToken());
		int endNum = Integer.parseInt(st.nextToken());
		int sum = 0, num = 1, index = 0;
		
		for(int i = 1; i <= endNum; i++) {
			index++; 	//같은수가 몇 번 들어갔는지
			if(i >= startNum) {
				sum += num;
			}
			if(index == num) {
				num++;		//i번째 수열에 위치한 숫자
				index = 0;
			}
			
		}
		System.out.println(sum);
	}
}
