package euclidean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2609 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int temp;
		
		if( b > a ) {
			temp = a;
			a = b;
			b = temp;
		}
		
		int result = gcd(a,b);
		sb.append(result).append("\n");
		sb.append(a*b/result);
		
		System.out.println(sb.toString());
		
		br.close();
	}
	
	static int gcd(int a, int b) {
//		if(b==0) return a;
//		return gcd(b, a%b);
		int t;
		while(b != 0) {
			t = a%b;
			a = b;
			b = t;
		}
		return a;
	}
}

//두 수가 10000이하 자연수이므로 최소공배수도 int안에 들어갈 수 있음.