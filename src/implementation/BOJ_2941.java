package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2941 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		sb.append("  ");
		String s = sb.toString();
		int result = s.length()-2;
		
		for(int i = 0; i < s.length(); i++) {
			switch(s.charAt(i)) {
			case 'c' : 
				if(s.charAt(i+1) == '=') {
					result--;
					i++;
				}else if(s.charAt(i+1) == '-') {
					result--;
					i++;
				}
				break;
			case 'd' : 
				if(s.charAt(i+1) == '-') {
					result--;
					i++;
				}else if(s.charAt(i+1) == 'z' && s.charAt(i+2) == '=') {
					result -= 2;
					i += 2;
				}
				break;
			case 'l' : 
				if(s.charAt(i+1) =='j') {
					result--;
					i++;
				}
				break;
			case 'n' : 
				if(s.charAt(i+1) =='j') {
					result--;
					i++;
				}
				break;
			case 's' : 
				if(s.charAt(i+1) == '=') {
					result--;
					i++;
				}
				break;
			case 'z' : 
				if(s.charAt(i+1) == '=') {
					result--;
					i++;
				}
				break;
			}
		}
		System.out.println(result);
	}
}
