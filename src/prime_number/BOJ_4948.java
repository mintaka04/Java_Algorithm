package prime_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4948 {
	
	static boolean[] prime = new boolean[246913];
	
	public static void main(String[] args) throws IOException{
		
		prime[0] = prime[1] = true;
		for(int i = 2; i*i <= 246912; i++) {
			if(!prime[i]) {
				for(int j = i*i; j <= 246912; j+=i) prime[j] = true;
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N;
		int num;
		
		while(true) {
			N = Integer.parseInt(br.readLine());
			if(N == 0) break;
			num = 0;
			
			for(int i = N+1; i <= 2*N; i++) {
				if(!prime[i]) num++;
			}
			
			sb.append(num+"\n");
		}
		
		System.out.println(sb);
	}
}
