package euclidean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2436 {
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int nGCD = Integer.parseInt(st.nextToken());
		int nLCM = Integer.parseInt(st.nextToken());
		int num = nLCM/nGCD;
		int limit = (int)Math.sqrt(num);
		
		int a = num;
		int b = 1;
		
		for(int i = 2; i <= limit; i++) {
			if(num%i == 0) {
				if(gcd(num/i, i) == 1) {
					if(a+b > i+(num/i)) {
						a = num/i;
						b = i;
					}
				}
			}
		}
		
		System.out.println(b*nGCD + " " + a*nGCD);
		
		
	}
	
	static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}
}

//a = Gx, b = Gy이고 Gxy = L일때
//xy = L/G
//이 때 어차피 xy는 서로소.