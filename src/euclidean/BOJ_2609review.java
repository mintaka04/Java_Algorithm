//유클리드호제법 GCD, LCM 복습!

package euclidean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2609review {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int gcdResult = gcd(a,b);
		
		sb.append(gcdResult).append("\n").append(a*b/gcdResult);
		System.out.println(sb.toString());
	}
	
	
	static int gcd(int a, int b) {
		
		int tmp;
		
		if(b > a) {
			tmp = a;
			a = b;
			b = tmp;
		}
		
		if(b==0) return a;
		else return gcd(b, a%b);
	}
	
	static int lcm(int a, int b) {
		return a*b/gcd(a,b);
	}
	
}
