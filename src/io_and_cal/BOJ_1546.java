package io_and_cal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1546 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		double[] arr = new double[num+1];
		double max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i] > max) max = arr[i];
		}
		
		double total = 0.0;
		for(int i = 1; i <= num; i++) {
			arr[i] = arr[i]/max*100;
			total += arr[i];
		}
		
		System.out.println(total/num);
			
	}
}