package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1316 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] alpha = new int[26];
		String s;
		int result = num;
		
		while(num-->0) {
			Arrays.fill(alpha, 0);
			s = br.readLine();
			alpha[s.charAt(0) - 'a']++;
			
			for(int i = 1; i < s.length(); i++) {
				int c = s.charAt(i) - 'a';
				if(alpha[c] == 0 || s.charAt(i) == s.charAt(i-1)) alpha[c]++;
				else{
					result--;
					break;
				}
			}
		}
		
		System.out.println(result);
	}
}
