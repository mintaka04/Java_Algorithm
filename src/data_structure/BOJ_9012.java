package data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9012 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		char[] arr;
		int flag = 0;
		
		while(T-->0) {
			arr = br.readLine().toCharArray();
			flag = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == '(') flag++;
				else if(arr[i] == ')') {
					flag--;
					if(flag < 0) i = arr.length;
				}
			}
			if(flag == 0) sb.append("YES" + "\n");
			else sb.append("NO" + "\n");
		}
		
		System.out.println(sb);
		
	}
}
