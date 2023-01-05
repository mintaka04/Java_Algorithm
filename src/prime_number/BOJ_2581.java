package prime_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2581 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int startNum = Integer.parseInt(br.readLine());
		int endNum = Integer.parseInt(br.readLine());
		
		//false가 소수
		boolean[] prime = new boolean[endNum+1];
		prime[0] = prime[1] = true;
		
		for(int i = 2; i*i <= endNum; i++) {
			if(!prime[i]) {
				for(int j = i*i; j <= endNum; j+=i) prime[j] = true;
			}
		}
		
		int sum = 0;
		int min = 0;
		
		for(int i = startNum; i <= endNum; i++) {
			if(!prime[i]) {
				sum += i;
				if(min == 0) min = i;
			}
		}
		
		if(min==0) System.out.println(-1);
		else {
			sb.append(sum).append("\n").append(min);
			System.out.println(sb);			
		}
		
	}
}
