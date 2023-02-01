package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2675 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testNum = Integer.parseInt(br.readLine());
		
		while(testNum--> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int repeat = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			for(int i = 0; i < s.length(); i++) {
				for(int j = repeat; j > 0; j--) {
					sb.append(s.charAt(i));					
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
		
		
	}
}
