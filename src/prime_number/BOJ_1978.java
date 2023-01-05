//소수 찾기 -> 에라토스테네스의 체

package prime_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1978 {
	
	//false인게 소수
	static final boolean[] prime = new boolean[1001];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		prime[0] = prime[1] = true;
		
		for(int i = 2; i*i <= 1000; i++) {
			if(!prime[i]) {
				for(int j = i*i; j <= 1000; j+=i) prime[j] = true;
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int result = 0;
		while(num-- > 0) {
			if(!prime[Integer.parseInt(st.nextToken())]) result++;
		}
		
		System.out.println(result);
	}
}
