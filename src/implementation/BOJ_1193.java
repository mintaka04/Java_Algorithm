package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1193 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) - 1;
		int cnt = 1;
		
		if(N == 0) System.out.println("1/1");
		else {
			while(N > 0) {
				cnt++;
				N -= cnt;
			}
			N = Math.abs(N);
			
			if(cnt%2 == 1) {
				//홀수 -> cnt/1에서 시작. 최대는 1/cnt
				System.out.println((1+N) + "/" + (cnt-N));
			}else {
				//짝수 -> 1/cnt에서 시작. 최대는 cnt/1
				System.out.println((cnt-N) + "/" + (1+N));
			}
		}
		
	}
}
