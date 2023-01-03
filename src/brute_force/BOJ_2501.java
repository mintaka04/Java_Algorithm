package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2501 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int tmp = 0;
		int result = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n%i == 0) tmp++;
			if(tmp >= k) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
		
	}
}

//n의 약수 중 k번째 작은 수 구하기.
//brute force -> 선형. 순차탐색.
