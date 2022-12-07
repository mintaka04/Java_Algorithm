package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_11720 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		char[] c_array = s.toCharArray();
		
		int total = 0;
		for(int i = 0; i < c_array.length; i++) {
			total += c_array[i] - '0';
		}
		
		System.out.println(total);
	}
}
