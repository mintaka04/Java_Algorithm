package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_8958 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= num; i++) {
//			String testCase = br.readLine();
//			char[] arr = testCase.toCharArray();
//			
//			int result = 0;
//			int sum = 0;
//			for(int j = 0; j < arr.length; j++) {
//				if(arr[j] == 'O') {
//					sum++;
//					result += sum;
//				}else {
//					sum = 0;
//				}
//			}
//			sb.append(result).append("\n");		
			
			
			//다른 방법
			String testCase = br.readLine();
			
			int result = 0;
			int sum = 0;
			for(int j = 0; j < testCase.length(); j++) {
				if(testCase.charAt(j) == 'O') {
					sum++;
					result += sum;
				}else {
					sum = 0;
				}
			}
			sb.append(result).append("\n");
			
			
			
			
		}
		System.out.println(sb);
		br.close();
	}
}
