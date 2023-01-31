package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5597{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] arr = new boolean[31];
		
		for(int i = 1; i < 29; i++) {
			arr[Integer.parseInt(br.readLine())] = true;
		}
		
		for(int i = 1; i < 31; i++) {
			if(!arr[i]) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb);
		br.close();
		
	}
}
