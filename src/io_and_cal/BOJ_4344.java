package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4344 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int caseNum = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= caseNum; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sNum = Integer.parseInt(st.nextToken());
			int[] arr = new int[sNum];
			int avg = 0;
			
			for(int j = 0; j < sNum; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				avg += arr[j];
			}
			avg /= sNum;
			
			float s = 0;
			for(int j = 0; j < sNum; j++) {
				if(arr[j] > avg) s++;
			}
			
			//sb.append(Math.round(s*100000/sNum)/1000.0 + "%").append("\n");
			sb.append(String.format("%.3f", s*100/sNum) + "%").append("\n");
		}
		System.out.println(sb);
		br.close();
		
	}
}
