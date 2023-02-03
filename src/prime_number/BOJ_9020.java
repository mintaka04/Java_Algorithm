package prime_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9020 {
	
	static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args) throws IOException{
		
		prime[0] = prime[1] = true;
		for(int i = 2; i*i <= 10000; i++) {
			if(!prime[i]) {
				for(int j = i*i; j <= 10000; j+=i) prime[j] = true;
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int TestNum = Integer.parseInt(br.readLine());
		int n;
		
		while(TestNum-->0) {
			n = Integer.parseInt(br.readLine());
			for(int i = n/2; i>=2; i--) {
				if(!prime[i] && !prime[n-i]) {
					sb.append(i+" "+(n-i)+"\n");
					break;
				}
			}
		}
		
		System.out.println(sb);
		br.close();
		
	}
}
