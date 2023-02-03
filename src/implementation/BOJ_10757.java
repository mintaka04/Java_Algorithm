package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_10757 {
	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		BigInteger bi1 = new BigInteger(st.nextToken());
//		BigInteger bi2 = new BigInteger(st.nextToken());
//		
//		System.out.println( bi1.add(bi2) );
		
		
		// char 배열로 받아준 다음 더해서 출력.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] a = st.nextToken().toCharArray();
		char[] b = st.nextToken().toCharArray();
		
		int index = 0;
		for(int i = a.length - 1, j = b.length - 1; i >= 0 || j >= 0; i--, j--) {
			
			if(i >= 0) index += a[i];
			if(j >= 0) index += b[i];
			
			sb.append(index%10);
			index /= 10;
		}
		
		if(index > 0) sb.append('1');
		
		System.out.println(sb.reverse());
		
	}
}
