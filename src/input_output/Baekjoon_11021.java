package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11021 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= num; i++) {
			st = new StringTokenizer(br.readLine());
			sb.append("Case #"+i+": ");
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
