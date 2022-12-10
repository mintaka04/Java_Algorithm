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

			if( num%2 != 0 && num%3 != 0 ) {		//2의 배수도 3의 배수도 아닐때
				
				return make_one(num-1) + 1;
			
			}else if( num%2 == 0 && num%3 != 0 ) {		//2의 배수이기만 할 때
				
				int a = make_one(num/2) + 1;
				int b = make_one(num-1) + 1;
				return Math.min(a, b);
				
			}else if( num%2 != 0 && num%3 == 0 ) {		//3의 배수이기만 할 때
				
				int a = make_one(num/3) + 1;
				int b = make_one(num-1) + 1;
				return Math.min(a, b);
				
			}else {		//2와 3의 배수일 때
				
				int a = make_one(num/3) + 1;
				int b = make_one(num/2) + 1;
				int c = make_one(num-1) + 1;				
				return Math.min(a, Math.min(b, c));
								
			}
			
		}
	}
}
