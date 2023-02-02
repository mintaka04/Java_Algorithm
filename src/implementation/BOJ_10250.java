package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10250 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int[] arr = new int[3];
		int N = Integer.parseInt(br.readLine());
		int roomNum = 0;
		
		while(N--> 0) {
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 3; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			if(arr[2] % arr[0] != 0) {
				sb.append(arr[2]%arr[0]);
				roomNum = arr[2]/arr[0] + 1;
			}else {
				sb.append(arr[0]);
				roomNum = arr[2]/arr[0];
			}

			if(roomNum > 9) sb.append(roomNum).append("\n");
			else sb.append("0"+roomNum).append("\n");
			
		}
		System.out.println(sb);
		br.close();
	}
}
