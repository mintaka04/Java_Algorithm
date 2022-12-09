package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10992 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		String space = " ";
		
		for(int i = 1; i < 2*num; i++) { 
			space += " ";
		}
		if(num != 1) {		//첫번째줄
			sb.append(space.substring(0, num-1)).append("*").append("\n");
		}
		for(int i = 1; i < num-1; i++) {

			sb.append(space.substring(0, num-i-1)).append("*");
			sb.append(space.substring(0,2*i-1)).append("*").append("\n");

		}
		for(int i = 1; i <= 2*num-1; i++) { 						//마지막 줄
			sb.append("*");
		}
		System.out.println(sb.toString());
	}
}
