package conditional_statement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_15552 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int testNum = Integer.parseInt(br.readLine());
//		StringBuilder sb = new StringBuilder();
//		
//		for(int i = 0; i < testNum; i++) {			
//			int result = 0;
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			result += Integer.parseInt(st.nextToken());
//			result += Integer.parseInt(st.nextToken());
//			sb.append(result).append("\n");
//		}
//		System.out.println(sb.toString());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testNum = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testNum; i++) {
			String s = br.readLine();
			int target = s.indexOf(" ");
			int result = Integer.parseInt(s.substring(0, target))
						+ Integer.parseInt(s.substring(target+1));
			bw.write(result+"\n");
		}
		
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}

//bufferedwriter 사용.
//StringTokenizer 대신에 띄어진 부분 인덱스 찾아내 substring으로 잘라내기.