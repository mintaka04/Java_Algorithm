package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1463 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result = make_one(num);
		
		System.out.println(result);
		
		
	}
	
	static int make_one(int num) {
		
		if(num == 1) {
			
			return 0;
			
		}else {
			
			int before = make_one(num-1) + 1;			
			int[] numArrary = {before, before, before};
			
			if(num%3 == 0) {
				numArrary[0] = make_one(num/3) + 1;
			}
			if(num%2 == 0) {
				numArrary[1] = make_one(num/2) + 1;
			}
			
			return Math.min(numArrary[0], Math.min(numArrary[1], numArrary[2]));
			
		}
	}
}
