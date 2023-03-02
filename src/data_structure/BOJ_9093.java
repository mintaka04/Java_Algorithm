package data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9093 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		char[] arr;
		
		while(T-->0) {
			st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				arr = st.nextToken().toCharArray();
				for(int i = arr.length - 1; i >= 0; i--) {
					sb.append(arr[i]);
				}
				sb.append(" ");
			}
			sb.append("\n");
			
		}
		
		
		
		System.out.println(sb);
	}
}
