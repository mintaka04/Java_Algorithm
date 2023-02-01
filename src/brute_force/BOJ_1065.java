package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1065 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int result = 99;
		
		if(x < 100) System.out.println(x);
		else {
			for(int i = 100; i <= x; i++) {
				if(checkHan(i)) result ++;
			}
			System.out.println(result);
		}
	}
	
	static private boolean checkHan(int num) {
		
		//항상 3자리수만 들어옴.
		if(num/100 + num%10 == (num/10)%10 * 2) return true;
		else return false;
	}
}
