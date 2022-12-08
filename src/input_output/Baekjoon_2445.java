package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2445 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= 2*num-1; i++) {
			
			if(i < num) {			//별 늘어나는 구간
				
				for(int j = 1; j <= i; j++) {
					sb.append("*");
				}
				for(int j = 1; j <= 2*(num-i); j++) {
					sb.append(" ");
				}
				for(int j = 1; j <= i; j++) {
					sb.append("*");
				}
				
			}else if(i > num){		//별 줄어드는 구간
				
				for(int j = 1; j <= 2*num-i; j++) {
					sb.append("*");
				}
				for(int j = 1; j <= 2*(i-num); j++) {
					sb.append(" ");
				}
				for(int j = 1; j <= 2*num-i; j++) {
					sb.append("*");
				}
				
			}else {					//가운데
				
				for(int j = 1; j <= 2*num; j++) {
					sb.append("*");
				}
				
			}
			sb.append("\n");
			
		}
		System.out.println(sb.toString());
	}
}
