package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10870 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fibonachi(n));
	}
	
	static int fibonachi(int a) {
		
		if(a == 0) return 0;
		if(a == 1) return 1;
		return fibonachi(a-1) + fibonachi(a-2);
	}
}
