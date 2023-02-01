package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1152 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int result = 0;
		
		while(st.hasMoreTokens()) {
			result++;
			st.nextToken();
		}
		
		System.out.println(result);
	}
}

//int cnt = 0;
//int pre = ' ';
//while(true) {
//	int s = System.in.read();
//	if(s == ' ' && pre != ' ') cnt++;
//	if(s == '\n' && pre != ' ') {
//		cnt++;
//		break;
//	}
//	pre = s;
//}
//System.out.println(cnt);