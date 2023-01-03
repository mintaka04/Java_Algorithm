//지능형 기차2

package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2460 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int stationNum = 10;
		int people = 0;
		int max = 0;
		
		while(stationNum-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			people += -Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			
			if(people > max) max = people;
		}
		
		System.out.println(max);
	}
}
