package conditional_statement;

import java.io.*;

public class BOJ_1110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int change = n;
		boolean flag = false;
		int cycle = 0;
		int quo = 0, rem = 0;		
		
		while(!flag) {
			quo = change/10;
			rem = change%10;
			change = (quo + rem)%10 + rem*10;
			cycle++;
			if(n==change) flag = true;
		}
		
		System.out.println(cycle);
		
	}
}
