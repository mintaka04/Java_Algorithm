package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_10950 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
//		for(int i = 0; i < num; i++) {
//			int a = System.in.read();
//			int b = System.in.read();
//			int c = System.in.read();
//			br.read();
//			System.out.println("a : " + a);
//			System.out.println("b : " + b);
//			System.out.println("c : " + c);
//			System.out.println(a - 48 + c - 48);
//		}
// cr lf가 따로 읽히므로 안됨
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append("\n");
		}
		System.out.println(sb);
		
	}
}
