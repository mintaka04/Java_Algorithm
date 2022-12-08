package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2439 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= num; i++) {
			
			for(int j = 1; j <= num-i; j++) {
				sb.append(" ");
			}
			for(int j = 1; j <= i; j++) {
				sb.append("*");
			}
			
			sb.append("\n");
			
		}
		
		System.out.println(sb.toString());
	}
}
