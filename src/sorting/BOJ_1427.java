package sorting;

import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1427 {
	
	public static void main(String[] args) throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
		StringBuilder[] sbArr = new StringBuilder[10];
		for(int i = 0; i < 10; i++) {
			sbArr[i] = new StringBuilder();
		}
		
		int n = ir.read() - '0';
		
		while(0 <= n && n <= 9) {
			sbArr[n].append(n);
			n = ir.read() -'0';
		}
		
		for(int i = 9; i >= 0; i--) {
			System.out.print(sbArr[i]);
		}
		
	}

	
}
//76ms