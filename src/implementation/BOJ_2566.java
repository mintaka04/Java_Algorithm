package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2566 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int max = -1;
		int index;
		int row = 0, column = 0;
		
		for(int i = 1; i <= 9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= 9; j++) {
				index = Integer.parseInt(st.nextToken());
				if(max < index) {
					max = index;
					row = i;
					column = j;
				}
			}
		}
		System.out.print(max + "\n" + row + " " + column);
	}
}
