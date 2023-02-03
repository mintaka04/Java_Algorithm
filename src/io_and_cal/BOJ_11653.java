package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11653 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		if(N == 1) return;
		
//		while(N > 1) {
//			for(int i = 2; i <= N; i++) {
//				if(N%i == 0) {
//					sb.append(i).append("\n");
//					N /= i;
//					i--;
//				}
//			}
//		}
//		
//		System.out.println(sb);
//		br.close();
		
		
		//쓸데없는 연산이 있다. i*i <= N인 조건 하에서만 연산하면 됨.
		//어차피 i라는건 i보다 작은 수들을 거쳐서 도달한 값.
		//즉, i*2, i*3 ... 등이 가능한지 이미 앞에서 연산을 했음.
		//따라서 i*i가 범위 안에 있는지만 알면 됨.
		
		for(int i = 2; i*i <= N; i++) {
			while(N%i == 0) {
				System.out.println(i);
				N /= i;
			}
		}
		
		if(N != 1) System.out.println(N);
		
		
	}
}
