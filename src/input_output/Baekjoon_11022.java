package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11022 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= num; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append("Case #"+i+": ");
			sb.append(a+" + "+b+" = "+(a+b)).append("\n");
			
		}
		
		System.out.println(sb.toString());
	}
}
