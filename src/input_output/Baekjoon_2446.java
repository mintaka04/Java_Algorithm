package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2446 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		String star = "*";
		String space = " ";
		
		for(int i = 1; i < 2*num-1; i++) {
			star += "*";
			space += " ";
		}
		for(int i = 0; i < num; i++) {
			sb.append(space.substring(0, i)).append(star.substring(0,2*(num-i)-1));
			sb.append("\n");
		}
		for(int i = 1; i <= num-1; i++) {
			sb.append(space.substring(0,num-1-i)).append(star.substring(0,2*i+1));
			sb.append("\n");
		}
		System.out.println(sb.toString());
		
	}
}
