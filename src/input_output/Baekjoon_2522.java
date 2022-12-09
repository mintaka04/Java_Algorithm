package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2522 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
//		for(int i = 1; i <= 2*num-1; i++) {
//			
//			if(i <= num) {
//				
//				for(int j = num-i; j > 0; j--) {
//					sb.append(" ");
//				}
//				for(int j = 1; j <= i; j++) {
//					sb.append("*");
//				}
//				
//			}else {
//				for(int j = 1; j <= i - num; j++) {
//					sb.append(" ");
//				}
//				for(int j = 2*num-i; j > 0; j--) {
//					sb.append("*");
//				}
//			}			
//			sb.append("\n");
//			
//		}
//		System.out.println(sb.toString());
		
		
		String star = "*";
		String space = " ";
		
		for(int i = 1; i <= num; i++) {
			star += "*";
			space += " ";
		}
		for(int i = 1; i <= num; i++) {
			sb.append(space.substring(0, num-i)).append(star.substring(0,i));
			sb.append("\n");
		}
		for(int i = 1; i <= num; i++) {
			sb.append(space.substring(0, i)).append(star.substring(0,num-i));
			sb.append("\n");			
		}
		System.out.println(sb.toString());
	}
}
