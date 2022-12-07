package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_11721 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		
		char[] c = s.toCharArray();

		
		for(int i = 0; i < c.length; i++) {
			sb.append(c[i]);
			
			if(i%10 == 9) {
				sb.append("\n");
			}
		}
		
		System.out.println(sb.toString());
	}
}
