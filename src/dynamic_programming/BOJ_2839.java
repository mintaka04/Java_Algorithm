package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2839 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int maxNum = N/5;
		int result = maxNum;
		N %= 5;
		
		if(N%3 != 0) {
			
			for(int i = 1; i <= maxNum; i++) {
				result--;
				N += 5;
				if(N%3 == 0) {
					result += N/3;
					break;
				}
			}	
			
		}else {
			result += N/3;
		}
		
		if(result == 0) System.out.println(-1);
		else System.out.println(result);
	}
}

///반례 12