package implementation;

import java.io.IOException;

public class BOJ_2908 {
	public static void main (String[] args) throws IOException {
		int a = 0, b = 0;
		a += System.in.read() - '0';
		a += 10*(System.in.read() - '0');
		a += 100*(System.in.read() - '0');
		
		System.in.read();
		
		b += System.in.read() - '0';
		b += 10*(System.in.read() - '0');
		b += 100*(System.in.read() - '0');
		
		if(a > b) System.out.println(a);
		else System.out.println(b);
	}
}
